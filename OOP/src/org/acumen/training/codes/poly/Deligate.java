package org.acumen.training.codes.poly;

import java.util.function.Predicate;

public class Deligate {
	// a method or an action in a form of an object
	public static void main(String[] args) {

		Predicate<Integer> isEvenLong = (Value) -> {
			if (Value % 2 == 0) {
				return false;
			}
			return true;
		};
		System.out.println(isEvenLong.test(10));
	}
}
