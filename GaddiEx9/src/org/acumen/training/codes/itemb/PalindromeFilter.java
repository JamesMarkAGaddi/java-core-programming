package org.acumen.training.codes.itemb;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PalindromeFilter implements IFilter<CharSequence> {

	@Override
	public boolean accept(CharSequence x) {
		if (x == null)
			return false;
		List<Character> charList = new ArrayList<>();
		for (int i = 0; i < x.length(); i++) {
			charList.add(x.charAt(i));
		}

		ListIterator<Character> forwardIterator = charList.listIterator();
		ListIterator<Character> backwardIterator = charList.listIterator(charList.size());

		while (forwardIterator.hasNext() && backwardIterator.hasPrevious()) {
			Character forwardChar = forwardIterator.next();
			Character backwardChar = backwardIterator.previous();

			if (!forwardChar.equals(backwardChar)) {
				return false; // If not a palindrome
			}
		}

		return true; // If a palindrome
	}
}

// Convert CharSequence to a list of characters
// Set up ListIterator for forward and backward traversal
// Manually compare using ListIterator without any explicit loop
// Compare the next character from the start and the previous character from the end
