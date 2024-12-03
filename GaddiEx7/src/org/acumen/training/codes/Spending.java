package org.acumen.training.codes;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.Function;

public class Spending {

	private static double totalSpending;

	public void generatePercentage() {

		try {
			Scanner scanner = new Scanner(System.in);
			double food = 0.0;
			double clothing = 0.0;
			double entertainment = 0.0;
			double rent = 0.0;
			boolean validInput;

			System.out.println("Enter the amount spent last month on the following items:");

			Function<String, Double> parseInput = input -> {
				input = input.replace("$", "").trim();
				return Double.parseDouble(input);
			};

			// Food
			do {
				validInput = true;
				System.out.print("Food: ");
				String input = scanner.nextLine().trim();

				try {
					food = parseInput.apply(input);
					if (food < 0) {
						throw new IllegalArgumentException("Amount must be a positive number.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid dollar amount.");
					validInput = false;
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					validInput = false;
				}
			} while (!validInput);

			// Clothing
			do {
				validInput = true;
				System.out.print("Clothing: ");
				String input = scanner.nextLine().trim();

				try {
					clothing = parseInput.apply(input);
					if (clothing < 0) {
						throw new IllegalArgumentException("Amount must be a positive number.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid dollar amount.");
					validInput = false;
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					validInput = false;
				}
			} while (!validInput);

			// Entertainment
			do {
				validInput = true;
				System.out.print("Entertainment: ");
				String input = scanner.nextLine().trim();

				try {
					entertainment = parseInput.apply(input);
					if (entertainment < 0) {
						throw new IllegalArgumentException("Amount must be a positive number.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid dollar amount.");
					validInput = false;
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					validInput = false;
				}
			} while (!validInput);

			// Rent
			do {
				validInput = true;
				System.out.print("Rent: ");
				String input = scanner.nextLine().trim();

				try {
					rent = parseInput.apply(input);
					if (rent < 0) {
						throw new IllegalArgumentException("Amount must be a positive number.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid dollar amount.");
					validInput = false;
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					validInput = false;
				}
			} while (!validInput);

			scanner.close();
			calculateTotal(food, clothing, entertainment, rent);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void calculateTotal(double food, double clothing, double entertainment, double rent) {

		totalSpending = food + clothing + entertainment + rent;
		calculatePercentage(food, clothing, entertainment, rent);

	}

	private static void calculatePercentage(double food, double clothing, double entertainment, double rent) {

		double foodPercent = food / totalSpending;
		double clothingPercent = clothing / totalSpending;
		double entertainmentPercent = entertainment / totalSpending;
		double rentPercent = rent / totalSpending;
		displayR(foodPercent, clothingPercent, entertainmentPercent, rentPercent);

	}

	private static void displayR(double foodP, double clothingP, double enterP, double rentP) {

		DecimalFormat fmt = new DecimalFormat("##.00%");

		System.out.println("\nCategory\t\tBudget");
		System.out.println("Food %25s".formatted(fmt.format(foodP)));
		System.out.println("Clothing %21s".formatted(fmt.format(clothingP)));
		System.out.println("Entertainment %16s".formatted(fmt.format(enterP)));
		System.out.println("Rent %25s".formatted(fmt.format(rentP)));

	}

}
