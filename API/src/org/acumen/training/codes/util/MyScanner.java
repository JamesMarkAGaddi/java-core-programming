package org.acumen.training.codes.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// prone to memory leak

		// keyboard inputs
		Scanner scan = new Scanner(System.in); // need muna gamitin si syste.in kasi nga utilitiy lang sya

		System.out.print("Enter name: ");
		String name = scan.next();
		System.out.println(name);
		scan.nextLine();

		System.out.print("Enter full name: ");
		String fName = scan.nextLine();
		System.out.println(fName);

		System.out.print("Enter age: ");
		byte age = scan.nextByte();
		System.out.println(age);
		scan.nextLine();

		System.out.print("Enter salary: ");
		float salary = scan.nextFloat();
		System.out.println(salary);
		scan.nextLine();

		// String input to primitive use parse
		System.out.print("Enter bonus: ");
		String bonus = scan.nextLine();
		double number = Double.parseDouble(bonus);
		System.out.println(number);
		scan.nextLine();

		scan.close();

		
		//file read
		String fileName = "./src/files/employees.txt";

		try {
			File file = new File(fileName);
			Scanner scanFile = new Scanner(file);

			while (scanFile.hasNext()) {
				String word = scanFile.next();
				System.out.println(word);
			}

			scanFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		}

		try {
			File file = new File(fileName);
			Scanner scanFile = new Scanner(file);

			while (scanFile.hasNext()) {
				String line = scanFile.nextLine();
				System.out.println(line);
			}

			scanFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		}

		// full-text search
		String content = "The grades  89.5, 45.67, 100.0, 55.5, and 88.6.";
		try (Scanner scanText = new Scanner(content)) {
			String rule = "[a-zA-Z, ]|\\\\*.$]";
			scanText.useDelimiter(rule);
			while (scanText.hasNext()) {
				String temp = scanText.next();
				if (!temp.isBlank() || !temp.isEmpty()) {
					System.out.println(temp);
				}
			}
		}
		
		
		

	}
}


