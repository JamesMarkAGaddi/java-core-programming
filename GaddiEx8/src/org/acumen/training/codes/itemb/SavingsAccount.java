package org.acumen.training.codes.itemb;

public class SavingsAccount {

	private static double annualInterestRate;
	private double savingsBalance;

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;
	}

	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}

}
