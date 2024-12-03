package org.acumen.training.codes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	// why we need try-catch
	// titigil kasi ang run kapag di maayos ang exception handling
	public void divide() {

		try (Scanner scanner = new Scanner(System.in)) {
			do {
				try {
					System.out.print("Enter numerator: ");
					String num = scanner.next();

					if (num.equalsIgnoreCase("e")) {
						break;
					}
					int numerator = getNumerator(num);

					System.out.print("Enter denominator: ");
					String denum = scanner.next();

					if (denum.equalsIgnoreCase("e")) {
						break;
					}
					int denuminator = getDenominator(num);

					int q = getQuotient(numerator, denuminator);
					
					System.out.println(q);

				} catch (ArithmeticException e) {
					continue;
				} catch (NumberFormatException e) {
					continue;
				}
			} while (true);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("BYEEEEEEEEEEE");
	}

	public int getNumerator(String num) throws InputMismatchException, Exception {

		try {
			int numerator = Integer.parseInt(num);
			return numerator;
		} catch (InputMismatchException e) {
			throw e;
		}
	}

	public int getDenominator(String denum) throws InputMismatchException, Exception {
		try {
			int denuminator = Integer.parseInt(denum);
			return denuminator;
		} catch (InputMismatchException e) {
			throw e;
		}
	}

	public int getQuotient(int numer, int denum) throws ArithmeticException, Exception {

		if (denum == 0) {
			throw new ArithmeticException();
		}
		return numer / denum;
	}
}
