package org.acumen.training.codes.itema;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestConcordance {

	public static void main(String[] args) {

		Concordance concordance = new Concordance();
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Input: ");
			String input = scanner.nextLine();

			Map<Character, List<Integer>> concordanceMap = concordance.concord(input);

			System.out.println("Concordance for input string:");
			System.out.println(concordanceMap);
		}
	}
}
