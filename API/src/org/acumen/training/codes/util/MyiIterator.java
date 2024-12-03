package org.acumen.training.codes.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class MyiIterator {

	public static void main(String[] args) {
		// This code creates an Iterator<Double> from a Stream of Double values (100.0,
		// 99.4, 98.5, 75.4, 80.0).
		// It then iterates through each value in the stream using the Iterator's
		// hasNext() and next() methods,
		// printing each value to the console
//Iterator<Double>: This is a generic type in Java that allows iteration over a collection of Double values (in this case, the elements from the stream)

		Iterator<Double> iterator = Stream.of(100.0, 99.4, 98.5, 75.4, 80.0).iterator();
		while (iterator.hasNext()) {
			double data = iterator.next();
			System.out.println(data);
		}
		
		float num = 6789.00F;
		System.out.format("Hello %.3f", num);

	}
}
