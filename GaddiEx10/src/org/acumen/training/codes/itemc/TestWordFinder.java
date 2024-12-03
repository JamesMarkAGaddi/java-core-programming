package org.acumen.training.codes.itemc;

import java.util.Map;

public class TestWordFinder {

	public static void main(String[] args) {

		String fileName = "./src/files/Words.txt"; // Update with the actual file path
		WordFinder finder = new WordFinder();
		Map<String, Integer> wordCountMap = finder.tabulateWords(fileName);

		finder.displayAlphabetical(wordCountMap);
		System.out.println();
		finder.displayByOccurrences(wordCountMap);
	}
}
