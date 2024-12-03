package org.acumen.training.codes;

public class TextConnection {
	
	@SuppressWarnings("unchecked")
	public <E> E mergeChars(E str1, E str2) {
		if (str1 instanceof CharSequence && str2 instanceof CharSequence) {
			CharSequence strOp1 = (CharSequence) str1;
			CharSequence strOp2 = (CharSequence) str2;
			return (E) String.join(" ", strOp1, strOp2); // Convert, default()
		} else if(str1 instanceof Character && str2 instanceof Character){
			Character charOp1 = (Character) str1;
			Character charOp2 = (Character) str2;
			return (E) String.join(" ", String.valueOf(charOp1), String.valueOf(charOp2));
		}
		return null;
	}

}
