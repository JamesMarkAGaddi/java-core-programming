package org.acumen.training.codes.itemb;

import java.util.ArrayList;
import java.util.Arrays;

public class MyFilter {

	public static <E> E[] filter(E[] a, IFilter<E> f) {

		ArrayList<E> resultList = new ArrayList<>();
		Traversal<E> arrayIterator = new Traversal<E>(a);

		while (arrayIterator.hasNext()) {

			E element = arrayIterator.next();
			if (f.accept(element)) {
				resultList.add(element);
			}
		}

		@SuppressWarnings("unchecked")
		E[] resultArray = (E[]) resultList.toArray(new CharSequence[resultList.size()]);
		resultArray = resultList.toArray(resultArray);

		return resultArray;
	}

	public static void displayResults(CharSequence[] charSequences) {

		System.out.print("Filtered Sequence: ");
		System.out.println(Arrays.toString(charSequences));
	}

}

// Filters an array based on the criteria defined in the provided filter. 
// a The array of elements to be filtered.
// f The filter that defines the acceptance criteria.	
// Iterate through each element in the array using the iterator.
// Get the next element from the iterator.
// Check if the element is accepted by the filter.
// If accepted, add it to the result list.
// Create a new array of the same type and size as the result list.
// Suppress the unchecked cast warning since the generic type cannot be checked at runtime.
// Fill the new array with elements from the result list.
// Return the filtered array.