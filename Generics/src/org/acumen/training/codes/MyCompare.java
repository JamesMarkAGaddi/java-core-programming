package org.acumen.training.codes;

public class MyCompare {
	
	// Generic method
	public <E, K> boolean isDifferent(E x, K y){ // Number, CharSequence, Character
		return x.equals(y);
	}
	
	public boolean isDifferent(int x, int y) {
		return x != y;
	}

}
