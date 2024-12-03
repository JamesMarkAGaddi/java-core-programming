package org.acumen.training.codes;

public class MyBank {

	public static void main(String[] args) {

		Bank SBCBank = new Bank(10000.00, "Juan Luna");

		Deposit deposit1 = new Deposit(1000, SBCBank, "A");
		Deposit deposit2 = new Deposit(2000, SBCBank, "B");

		Withdrawal withdrawal1 = new Withdrawal(3000, SBCBank, "C");
		Withdrawal withdrawal2 = new Withdrawal(10000, SBCBank, "D");

		// ganto para masunod yung order ng pagkakacode
//		try {
//			deposit1.start();
//			deposit1.join();
//			deposit2.start();
//			deposit2.join();
//			withdrawal1.start();
//			withdrawal1.join();
//			withdrawal2.start();
//			withdrawal2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		// another way
		deposit1.start();
		deposit2.start();
		withdrawal1.start();
		withdrawal2.start();
	}

	private static class Deposit extends Thread {
		private double amount;
		private Bank bank;
		private String name;

		public Deposit() {

		}

		public Deposit(double amount, Bank bank, String name) {
			this.amount = amount;
			this.bank = bank;
			this.name = name;
		}

		@Override
		public void run() {
			double resDouble = bank.deposit(amount);
			System.out.println("%f %s".formatted(resDouble, name));
			Thread.yield(); // for synchroinized and unmutable order, gamitn mo to +synchronized classes,
							// wala tong condition nilalagay lang sya
		}
	}

	private static class Withdrawal extends Thread {
		private double amount;
		private Bank bank;
		private String name;

		public Withdrawal() {
			// TODO Auto-generated constructor stub
		}

		public Withdrawal(double amount, Bank bank, String name) {
			this.amount = amount;
			this.bank = bank;
			this.name = name;
		}

		@Override
		public void run() {
			double resDouble = bank.withdraw(amount);
			System.out.println("%f %s".formatted(resDouble, name));
			Thread.yield();
		}

	}

}
