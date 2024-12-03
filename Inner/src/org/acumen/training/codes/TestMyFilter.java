package org.acumen.training.codes;

import java.util.Arrays;

public class TestMyFilter {

	public static void main(String[] args) {

		String[] words = { "Carrac", "cat", "or", "racecar", "cats" };

		// palidrome check
		String[] reStrings = MyFilter.apply(words, new IFilter<String>() {

			@Override
			public boolean accept(String str) {
				StringBuilder stringBuilder = new StringBuilder(str);
				String string = stringBuilder.reverse().toString();
				return str.equalsIgnoreCase(string);
			}
		});

		System.out.println(Arrays.toString(reStrings));

		// endswith s check
		reStrings = MyFilter.apply(words, new IFilter<String>() {

			@Override
			public boolean accept(String str) {
				return str.toString().endsWith("s");
			}
		});

		System.out.println(Arrays.toString(reStrings));
	}

}
