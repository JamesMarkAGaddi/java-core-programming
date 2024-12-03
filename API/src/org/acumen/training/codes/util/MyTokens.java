package org.acumen.training.codes.util;

import java.util.StringTokenizer;

public class MyTokens {
	// tokens can be of any type or symbol that we extract from a file
	// came form the compilation process
	public static void main(String[] args) {
		// gets a word or letter
		String message = "The+fox+jumps+over the window";
		StringTokenizer st = new StringTokenizer(message, "+ "); // default delimiter is whitespace
		int count = st.countTokens();
		String[] tokens = new String[count];
		int i =0;
		System.out.println(count);
		while (st.hasMoreTokens()) {
			tokens[i] = st.nextToken();
			System.out.println(tokens[i]);
			i++;
		}
		
		for (String lookup : tokens) {
			System.out.println(lookup);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//this is not like RegEx
		String expr = "The data are 60 80 90 100";
		StringTokenizer st2 = new StringTokenizer(expr, "[0-9]+"); // default delimiter is whitespace
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
	}
}