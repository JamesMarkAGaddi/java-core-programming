package org.acumen.training.codes;

import org.acumen.training.codes.others.Employee;
import org.acumen.training.codes.others.Employee2;

public class TestEmp {

	public static void main(String[] args) {

		Employee emp;

		try {
			emp = Employee.getInstance();
			System.out.println(emp.hashCode());
			emp = Employee.getInstance();
			System.out.println(emp.hashCode());
			emp = Employee.getInstance();
			System.out.println(emp.hashCode());
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		Employee2 empsEmployee2 = Employee2.getInstance();
		System.out.println(empsEmployee2.hashCode());
		empsEmployee2 = Employee2.getInstance();
		System.out.println(empsEmployee2.hashCode());
		empsEmployee2 = Employee2.getInstance();
		System.out.println(empsEmployee2.hashCode());
		empsEmployee2 = Employee2.getInstance();
		System.out.println(empsEmployee2.hashCode());
		
		
		
		
	}

}
