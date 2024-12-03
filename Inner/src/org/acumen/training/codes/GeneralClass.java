package org.acumen.training.codes;

import java.time.LocalDate;

public class GeneralClass {

	public int x = 10;
	private static String name = "Outer Class";
	public int zip = 1020;
	private LocalDate dateTransferred = LocalDate.now();

	public void showLocation() {
		System.out.println("Makati, PHilippines");
	}

	public void accessResouce() {
		calculateData(10, 20);
	}

	// method local-timer
	// you should follow the sequence of this part below
	// gamitin kapag osbrang complicated ng alogrithm

	public void calculateData(int x, int y) {

		class GeneralInfo {
			public void accessResource() {
				System.out.println(GeneralClass.name);
				GeneralClass.this.showLocation();
			}
		}

		class Addition {

			// di mo na pwede machange yung mga vars pero pwede mo namna maccess
			public int add(int x, int y) {
				return x + y;
			}
		}

		class Subtraction {
			public int subtract(int x, int y) {
				return x - y;
			}
		}

		Addition addition = new Addition();
		Subtraction subtraction = new Subtraction();
		GeneralInfo generalInfo = new GeneralInfo();

		int sum = addition.add(x, y);
		int diff = subtraction.subtract(x, y);
		generalInfo.accessResource();

		System.out.println("%d %d".formatted(sum, diff));
	}

	public void computeAddition(int x, int y) {

		class Addition {

			public int add(int x, int y) {
				return x + y;
			}
		}
	}
}
