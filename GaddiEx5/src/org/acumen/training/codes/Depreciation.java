package org.acumen.training.codes;

public class Depreciation {

	public static void main(String[] args) {
		
		byte years = 7;
		short amount = 28000;
		short depreciate = 4000;
		short totalDep = 0;

		System.out.println(String.format("%52s%17s", "End-of-year", "Accumulated"));
		System.out.println(String.format("%11s%20s%18s%21s", "Year", 
									 	 "Depreciation", "value", "depreciation"));
		System.out.println(String.format("%11s%20s%20s%19s", "----", 
										 "------------", "------------", "-------------"));

		for (byte counter = 0; counter < years; counter++) {
			amount -= depreciate;
			totalDep += depreciate;
			System.out.println(String.format("%8s %-15d %-16d %-20d%-5d", " ", counter+1, depreciate, amount, totalDep));
		}
	}
}
