package org.acumen.training.codes.itemb;

public class TestSavingsAccount {
	
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);
        System.out.printf("Saver 1 starting balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 starting balance: $%.2f%n", saver2.getSavingsBalance());
        System.out.println();
        
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 new balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 new balance: $%.2f%n", saver2.getSavingsBalance());
        System.out.println();

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 new balance after next month: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 new balance after next month: $%.2f%n", saver2.getSavingsBalance());
    }
}