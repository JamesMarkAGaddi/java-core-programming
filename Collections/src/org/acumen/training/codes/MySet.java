package org.acumen.training.codes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	public static void main(String[] args) {
		// hashSet
		HashSet<Double> hashSet = new HashSet<Double>();
		Set<Double> set = new HashSet<Double>(100);

		hashSet.add(99.5);
		hashSet.add(19.5);
		hashSet.add(1.5);
		hashSet.add(-10.6);
		hashSet.add(99.5);
		hashSet.add(111.78);
		System.out.println(set);
		// depends ang algo ng pagkakayos sa OS

		set.add(1.2);
		set.add(1.3);
		set.add(1.4);
		hashSet.addAll(set);
		System.out.println(hashSet);

		// work around kasi limited
		List<Double> tempDoubles = new ArrayList<Double>(hashSet);
		tempDoubles.set(0, -1000.5);
		hashSet.clear();
		hashSet.addAll(tempDoubles);
		tempDoubles = null;

		System.out.println(hashSet);

		if (hashSet.contains(-1020.5)) { // validate mo muna kung nasa set before removal kasi di naman yan mapapansin
											// kung wala
			hashSet.remove(-1000.5);
			System.out.println(hashSet);
		} else
			System.err.println("RRRRRRAWWWWWWWR");

		hashSet.clear();

		// retrieval

		Iterator<Double> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator);
		}

		// Linked HashSet
		// not duplicated, based sa input
		// LinkedHashSet<Double> linkedHashSet = new LinkedHashSet<Double>();
		Set<Double> linkedSet = new LinkedHashSet<Double>(100);

		linkedSet.add(99.5);
		linkedSet.add(19.5);
		linkedSet.add(1.5);
		linkedSet.add(-10.6);
		linkedSet.add(99.5);
		linkedSet.add(111.78);

		System.out.println(linkedSet);

		// not duplicate, sorted
		// TreeSet<Double> treeSet = new TreeSet<Double>();
		Set<Double> treeSet2 = new TreeSet<Double>(new DoubleComparator()); // used the default class sa baba as
																			// comparator

		treeSet2.add(99.5);
		treeSet2.add(19.5);
		treeSet2.add(1.5);
		treeSet2.add(-10.6);
		treeSet2.add(99.5);
		treeSet2.add(111.78);

		System.out.println(treeSet2);

	}
}

class DoubleComparator implements Comparator<Double> { // gawa ka lagi ganto kapag may sorting na kailangan para ready
														// sa sorting

	@Override
	public int compare(Double o1, Double o2) {
		if (o1.compareTo(o2) == 0) {
			return 0;
		} else if (o1.compareTo(o2) > 0) {
			return -2;
		}
		return 2;
	}
}
