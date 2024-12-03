package org.acumen.training.codes.itemb;

import java.util.Scanner;

public class TestHTMLChecker {

	public static void main(String[] args) {

		HTMLChecker checker = new HTMLChecker();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the path to the HTML file: ");
		String htmlPath = scanner.nextLine(); // Read HTML file path from user

		boolean isValid = checker.validate(htmlPath); // Validate the HTML file

		if (isValid) {
			System.out.println("The HTML file is properly nested.");
		} else {
			System.out.println("The HTML file is NOT properly nested.");
		}

		scanner.close(); // Close the scanner
	}
}
