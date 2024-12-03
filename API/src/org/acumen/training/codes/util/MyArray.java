package org.acumen.training.codes.util;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {

		double[] grades = { 100.0, 99.4, 98.5, 75.4, 80.0 };
		System.out.println(Arrays.toString(grades)); // printing arrays

		// initializing arrays
		int[] intData = new int[10];
		Arrays.fill(intData, -1);
		System.out.println(Arrays.toString(intData));

		// copy of array data
		double[] gradesCopy = Arrays.copyOf(grades, 2);
		System.out.println(Arrays.toString(gradesCopy));

		// copy of array data within a range
		double[] gradesCopy2 = Arrays.copyOfRange(grades, 3, grades.length);
		System.out.println(Arrays.toString(gradesCopy2));

		// check length then check content, order and data
		// comparison or 2 1D-arrays
		char[] word1 = { 'c', 'a', 't', 'e' };
		char[] word2 = { 'c', 'a', 't' };
		System.out.println(Arrays.equals(word1, word2));
		
		//checks what index are the arrays mismatched
		System.out.println(Arrays.mismatch(word1, word2));

		// compares 2 2D-arrays
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepEquals(matrix1, matrix2));

		Arrays.sort(grades);//binary search algo 
		System.out.println(Arrays.toString(grades)); 
		
		int index50 = Arrays.binarySearch(grades, 50.0); //sort first before binary search
		System.out.println(index50);
		int index51 = Arrays.binarySearch(grades, 200.0);
		System.out.println(index51);
		int index52 = Arrays.binarySearch(grades, 90.0);
		System.out.println(index52);
		int index53 = Arrays.binarySearch(grades, 98.5);
		System.out.println(index53);
		
		
	}
}
