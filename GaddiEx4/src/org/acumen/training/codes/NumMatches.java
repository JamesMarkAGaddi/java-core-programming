package org.acumen.training.codes;

public class NumMatches {

	public int matchSubWords(String word1, String word2) {
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		int matchLetters = 0;

		int minLength = computeMin(word1Array.length, word2Array.length);

		for (int i = 0; i < minLength; i++) {
			if (word1Array[i] == word2Array[i]) {
				matchLetters++;
			} else {
				break;
			}
		}
		return matchLetters;
	}

	private int computeMin(int length, int length2) {
		int min = Math.min(length, length2);
		return min;
	}

}
