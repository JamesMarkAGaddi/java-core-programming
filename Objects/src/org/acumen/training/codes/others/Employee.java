package org.acumen.training.codes.others;

public class Employee {

	private static int count = 0;

	private Employee() {

		System.out.println("HEllllllo");

	}

	// singleton method
	// requires factory method
	public static final Employee getInstance() throws NullPointerException, Exception {
		if (count == 0) {
			count++;
			return new Employee();
		}
		throw new NullPointerException("Nakaisa ka na ah, isang instantiate lang idol");
	}

	// can manage instantiation process
	// lazy initialization yung gumamit ka ng count, rektahan ganun checheck mo lang
	// kung nainitialize na sya
	//

}
