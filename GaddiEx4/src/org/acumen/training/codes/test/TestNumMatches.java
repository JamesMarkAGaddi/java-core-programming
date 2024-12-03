package org.acumen.training.codes.test;

import org.acumen.training.codes.NumMatches;

public class TestNumMatches {

	public static void main(String[] args) {

		NumMatches num = new NumMatches();
		int numMatch = num.matchSubWords("Bookclub", "Bookcase");
		System.out.println("Number of matches: " + numMatch);


		NumMatches num2 = new NumMatches();
		int numMatch2 = num2.matchSubWords("Miguel", "Migz");
		System.out.println("Number of matches: " + numMatch2);
	}

}
