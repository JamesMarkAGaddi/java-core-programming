package org.acumen.training.codes.itema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class Concordance {

	public Map<Character, List<Integer>> concord(String str) {

		String string = str.replaceAll(" ", "");
		Map<Character, List<Integer>> concordance = new TreeMap<>();
		ListIterator<Character> iterator = new ArrayList<Character>() {
			private static final long serialVersionUID = 1L;
			{
				for (Character ch : string.toCharArray()) {
					add(ch);
				}
			}
		}.listIterator();

		Integer index = 0;
		while (iterator.hasNext()) {
			Character ch = iterator.next();
			concordance.putIfAbsent(ch, new ArrayList<>());
			concordance.get(ch).add(index); // check the index of the key "ch" and appends the index to
												// concordanceMap

			index++;
		}

		return Collections.unmodifiableMap(concordance);
	}
}
