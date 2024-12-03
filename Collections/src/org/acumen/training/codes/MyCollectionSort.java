package org.acumen.training.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyCollectionSort {

	public static void main(String[] args) {

		LoginRepository repo = new LoginRepository();
		List<Login> recList = repo.getAllLogins(); // used Login object here kasi nasakanya yung instance vars
		System.out.println(recList);

		//Collections.sort(recList); // connected to sa login.java na may Comparable implementation then inedit yung compareTo method
		Collections.sort(recList, new MyUsernameComparator());
					
		Iterator<Login> iterator = recList.iterator();
		while (iterator.hasNext()) {
			Login login = iterator.next();
			System.out.println(String.format("%d %s %s", login.getId(),
					login.getUsername(), login.getPasswordString()));
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		list.add(6000);
		list.add(7000);
		list.add(8000);

		Collections.sort(list);
		System.out.println(list);
		;

		Collections.reverse(list);
		System.out.println(list);
	}
}
