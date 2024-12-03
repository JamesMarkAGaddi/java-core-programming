package org.acumen.training.codes.test;

import org.acumen.training.codes.BankCustomer;
import org.acumen.training.codes.BirthdayCreation;

public class TestBirthdayCreation {

	public static void main(String[] args) {

		BirthdayCreation creator = new BirthdayCreation();
		BankCustomer customer = creator.askCustomerbirthday();
		String message = creator.showBday(customer);
		System.out.println(message);
	}
}
