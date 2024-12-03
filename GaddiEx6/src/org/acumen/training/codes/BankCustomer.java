/*
 * This is BankCustomer class - used to store birthday and fullName variables
 */
package org.acumen.training.codes;

import java.util.Calendar;

public class BankCustomer {

	public Calendar birthday;
	public String fullName;

	public BankCustomer(String fullName, Calendar birthday) {
		this.fullName = fullName;
		this.birthday = birthday;
	}
}
