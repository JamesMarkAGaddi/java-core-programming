package org.acumen.training.codes;

import java.util.Arrays;

public class NumRotation {

	public static void rotateRight(float[] arr) {

		if (arr.length <= 1) {
			return;
		}

		float[] temp = new float[arr.length];
		temp[arr.length - 1] = arr[arr.length - 1];

		for (int i = 0; i < arr.length - 1; i++) {
			if (i == arr.length - 2) {
				temp[0] = arr[i];
			} else {
				temp[i + 1] = arr[i];
			}
		}

		arr = temp;
		temp = null;

		System.out.println(Arrays.toString(arr));
	}
}
