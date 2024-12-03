package org.acumen.training.codes;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Spending {

	public void askCost() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the cost: ");
			DecimalFormat inputMask = new DecimalFormat("$#");
			String costStr = scanner.next();
			Number cost = inputMask.parse(costStr);
			int costInt = cost.intValue();
			System.out.println(costInt);
		} catch (ParseException | InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		

	}
}
