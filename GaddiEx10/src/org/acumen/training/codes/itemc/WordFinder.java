package org.acumen.training.codes.itemc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WordFinder {

	public record WordFrequency(String word, Integer count) {
	}

	public Map<String, Integer> tabulateWords(String fileName) {

		Map<String, Integer> wordCount = new TreeMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.toLowerCase().split("\\W+");

				int index = 0;
				while (index < words.length) {
					String word = words[index];
					if (!word.isEmpty()) {
						Integer count = wordCount.getOrDefault(word, 0);
						wordCount.put(word, count + 1); // Save the (word, occurrence)
					}
					index++;
				}
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		return Collections.unmodifiableMap(wordCount);
	}

	public void displayAlphabetical(Map<String, Integer> wordCountMap) {

		System.out.println("Words sorted alphabetically:");
		for (Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println("%-10s %5d".formatted(entry.getKey(), entry.getValue()));
		}
	}

	public void displayByOccurrences(Map<String, Integer> wordCountMap) {

		List<WordFrequency> wordFrequencies = new ArrayList<>();
		for (Entry<String, Integer> entry : wordCountMap.entrySet()) {
			wordFrequencies.add(new WordFrequency(entry.getKey(), entry.getValue()));
		}

		Collections.sort(wordFrequencies, new Comparator<WordFrequency>() {
			@Override
			public int compare(WordFrequency wf1, WordFrequency wf2) {
				return Integer.compare(wf1.count(), wf2.count());
			}
		});

		displayResults(wordFrequencies);

	}

	private void displayResults(List<WordFrequency> wFrequencies) {

		System.out.println("Words sorted by occurrences:");
		for (WordFrequency wf : wFrequencies) {
			System.out.println("%-10s %5d".formatted(wf.word(), wf.count()));
		}
	}
}
