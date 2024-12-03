package org.acumen.training.codes;

public class ArrDataConversion {

	public void processArrData(int... arr) {
		if (arr.length % 4 != 0) {
			System.out.println("The length of the array must be divisible by 4.");
			return;
		}

		for (int i = 0; i < arr.length; i += 4) {
			int[] modified = new int[4];
			for (int j = 0; j < 4; j++) {
				if (arr[i + j] == 0) {
					modified[j] = arr[i + j];
				}
				modified[j] = arr[i + j] + 15;
			}

			char[] word = new char[4];
			word[0] = (char) modified[3];
			word[1] = (char) modified[2];
			word[2] = (char) modified[0];
			word[3] = (char) modified[1];

			System.out.println(new String(word).trim());
		}
	}

}
