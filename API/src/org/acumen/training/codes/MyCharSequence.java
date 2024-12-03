package org.acumen.training.codes;

public class MyCharSequence {
	
	public static void main(String[] args) {
		CharSequence seq1  = new String("This is a char sequence");
		CharSequence seq2  = new StringBuffer("This is also char sequence");
		CharSequence seq3  = new StringBuilder("This is another char sequence");
		
		System.out.println(seq1.toString());
		System.out.println(seq1.length());

		System.out.println(seq2.toString());
		System.out.println(seq2.length());

		System.out.println(seq3.toString());
		System.out.println(seq3.length());
		
	}

}
