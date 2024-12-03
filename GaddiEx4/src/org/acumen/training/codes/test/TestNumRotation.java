package org.acumen.training.codes.test;

import org.acumen.training.codes.NumRotation;

public class TestNumRotation {

	public static void main(String[] args) {

		float[] values1 = { 5.8f, 2.6f, 9.1f, 3.4f, 7.0f };
		float[] values2 = { 65.7f, 2.62f, 3549.1f, 3.43f, 45.0f };
		float[] values3 = { 23.6f, 232.6f, 9.31f, 23453.4f, 1.54f };

		System.out.println("Original array:");
		for (float v : values1) {
			System.out.print(v + " ");
		}

		System.out.println("\nArray after rotation:");
		NumRotation.rotateRight(values1);
		
		System.out.println("Original array:");
		for (float v : values2) {
			System.out.print(v + " ");
		}

		System.out.println("\nArray after rotation:");
		NumRotation.rotateRight(values2);
		
		System.out.println("Original array:");
		for (float v : values3) {
			System.out.print(v + " ");
		}

		System.out.println("\nArray after rotation:");
		NumRotation.rotateRight(values3);
	}
}
