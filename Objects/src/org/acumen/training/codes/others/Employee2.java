package org.acumen.training.codes.others;

public class Employee2 {

	private static final Employee2 emp = new Employee2();

	private Employee2() {

	}

	public static Employee2 getInstance() {
		return emp;
	}

}
