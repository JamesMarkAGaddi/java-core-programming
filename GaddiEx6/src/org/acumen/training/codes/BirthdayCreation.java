/*
 * This class is used to get inputs from customers, then use BankCustomer class to save the inputs
 */
package org.acumen.training.codes;

import java.util.Calendar;
import java.util.Scanner;

public class BirthdayCreation {

	public BankCustomer askCustomerbirthday() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter full name: ");
		String fName = scanner.nextLine();

		System.out.print("Enter birthday month [1-12]: ");
		int bdayMonth = scanner.nextInt();

		System.out.print("Enter birthday day: ");
		int bdayDay = scanner.nextInt();

		System.out.print("Enter birthday year: ");
		int bdayYear = scanner.nextInt();

		Calendar birthday = Calendar.getInstance();
		birthday.set(bdayYear, bdayMonth-1 , bdayDay); //-1 to save correct month

		scanner.close();
	
		return new BankCustomer(fName, birthday);
	}

	/*
	 * This method is used to display the output
	 */
	public String showBday(BankCustomer customer) {
		int month = customer.birthday.get(Calendar.MONTH) + 1; //+1 to output understood by users
		int day = customer.birthday.get(Calendar.DAY_OF_MONTH);
		return customer.fullName + "'s birthday is " + month + "/" + day + ".";
	}
}
