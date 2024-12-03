package org.acumen.training.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyTraversal {

	public static void main(String[] args) {
		
		List<String> nameStrings = new ArrayList<String>();
		nameStrings.add("Lorna");
		nameStrings.add("Anna");
		nameStrings.add("Fe");

		
		//this one won't work sa batch process,
		//COncurrentExceptions kasi sabay na transactions 
		//sa collections di pwede na may sabay na transacition kasi asynch sya
		
//		for (String lookup:nameStrings) {			
//			if (lookup.length() <= 2 ) {
//				nameStrings.remove(lookup);
//			}
//			System.out.println(lookup);
//		}
		
		//ito ang tama
//		Iterator<String> iterator = nameStrings.iterator(); traversala		
		
		ListIterator<String> iterator = nameStrings.listIterator(); // double traversal
		while (iterator.hasNext()) {
			 String tempString = iterator.next();
			 if (tempString.length() <= 2 ) {
					iterator.remove();
				} else {
				System.out.println(tempString);
				}
		}
		
		while (iterator.hasPrevious()) { //need mo muna ng next para magamit to kasi wala ka namang babalikan kung wala kang nadaanan
			 String tempString = iterator.previous();
			 if (tempString.length() <= 2 ) {
					iterator.add("NA");
				} else {
				System.out.println(tempString);
				}
		}
				
	
	}
}
