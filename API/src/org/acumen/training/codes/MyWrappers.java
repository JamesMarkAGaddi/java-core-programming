package org.acumen.training.codes;

public class MyWrappers {
	// what if the data is nullable like the primitive types? use wrappers
	public static void main(String[] args) {
		byte age = 89;
		Byte bigAge = Byte.valueOf(age);
		System.out.println(bigAge);
		System.out.println(bigAge.hashCode());

		Integer id = Integer.valueOf(1010101);
		int idInt = id.intValue();
		System.out.println(idInt);
		idInt += 1;
		
		//autoboxing
		byte age2 = 124;
		Byte bigAge2 = age;

		//auto unboxing
		Integer id2 = Integer.valueOf(1010101);
		int idInt2 = id;
		
		String ageStr = String.valueOf(age);
		String salaryStr = "13232.00"; 
		double salary = Double.parseDouble(salaryStr);
		String letter = "a";
		char letterChar = letter.charAt(0);
		
		
	}
}
