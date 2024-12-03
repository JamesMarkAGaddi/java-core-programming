package org.acumen.training.codes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// to create different features using a body "Manager"
public class TestManager {

	public static void main(String[] args) {
		// kapag may kasamang curly braces meaning may anonymous class to sa likod
		Manager manager = new Manager() {

			public String country = "Philippines";

			@Override
			public void showDetails() {
				System.out.println(country);
			}

		};
		
		Manager manager2 = new Manager() {

			public String country = "Brazil";

			@Override
			public void showDetails() {
				System.out.println(country);
			}

		};

		manager.showDetails();
		System.out.println("-------------------------------------");
		manager2.showDetails();
		System.out.println("-------------------------------------");

		Company company = new Company();
		company.createManager(new Manager() {
		});
		
		
		//kung gusto mo ng variation ng implementation ng ibang methhods or class or API pwede to
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(23);
		arrList.add(342);
		arrList.add(34);
		arrList.add(67);
		
		Iterator<Integer> iterator = new Iterator<Integer>() {
			
			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Iterator<Integer> iterator2 = new Iterator<Integer>() {
			
			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}
}
 