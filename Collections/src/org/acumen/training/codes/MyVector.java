package org.acumen.training.codes;

import java.util.Enumeration;
import java.util.Vector;

public class MyVector {

		public static void main(String[] args) {
					
			Vector<Integer> vector = new Vector<Integer>();
			//synchronized ang mga methods dito meaning concurrent so di sya maganda sa web kasi single-threaded dun
			int cap = vector.capacity();
			System.out.println(cap);
			//di pa ginagamit to may capacity na agad
			
			//this is an iterable not an enum
			Enumeration<Integer> iterEnumeration = vector.elements();
			while(iterEnumeration.hasMoreElements()) {
				Integer tempInteger = iterEnumeration.nextElement();
				System.out.println(tempInteger);
			}
			
		}
}
