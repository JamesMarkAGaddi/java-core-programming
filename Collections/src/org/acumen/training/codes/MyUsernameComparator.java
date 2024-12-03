package org.acumen.training.codes;

import java.util.Comparator;

public class MyUsernameComparator implements Comparator<Login> {

	@Override
	public int compare(Login o1, Login o2) {

		if (o1.getUsername().compareTo(o2.getUsername()) == 0) {
			return 0;
		} else if (o1.getUsername().compareTo(o2.getUsername()) > 0) {
			return -2;
		} else {
			return 2;
		}
	}
}
