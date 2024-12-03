package org.acumen.training.codes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MyMap {
	// mas malapit ito sa set kasi need ng uniquenss sa key
	// Entry<key,value>
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap1 = new HashMap<>();
		Map<Integer, String> hashMap2 = new HashMap<>(100); // prefered to kasi under ng Hashmap ang map
		int entries = hashMap2.size();
		System.out.println(entries);
		System.out.println(hashMap2);

		// individual insert
		hashMap2.put(300, "Jamez");
		hashMap2.put(1, "Venti");
		hashMap2.put(2, "Balmond");
		hashMap2.put(3, "Mattz");
		hashMap2.put(-4, "Aulot");
		hashMap2.put(3, "Clarkz");
		System.out.println(hashMap2);

		// bulk insert
		// parang addAll
		hashMap1.put(1000, "Jean");
		hashMap1.put(2000, "June");
		hashMap1.put(3000, "Jiggs");
		hashMap2.putAll(hashMap1);
		System.out.println(hashMap2);

		// pre-validation muna
		if (hashMap2.containsKey(3)) {
			// update
			System.out.println(hashMap2.replace(3, "Migz")); // check kung anong key yung mapapalitan
			System.out.println(hashMap2);
		}

		// Strict update
		if (hashMap2.containsKey(2000) && hashMap2.containsValue("June")) {

			System.out.println(hashMap2.replace(2000, "June", "Daisy"));
			System.out.println(hashMap2);
		}

		// batch update

		BiFunction<Integer, String, String> replaceOddKey = new BiFunction<Integer, String, String>() {

			@Override
			public String apply(Integer t, String u) {
				int key = t; // unbox muna yung Integer wrapper
				if (key % 2 == 0) {
					return u;
				}
				return "NA";
			}
		};

		hashMap2.replaceAll(replaceOddKey);
		System.out.println(hashMap2);

		// remove post validation
		System.out.println(hashMap2.remove(33000)); // outputs kung meron or walang ganung key

		// remove pre validation
		if (hashMap2.containsKey(13)) {
			System.out.println(hashMap2.remove(13));
		}
		System.out.println(hashMap2.remove(3000, "Jiggs"));

		// Strict remove with pre and post validation
		if (hashMap2.containsKey(2000) && hashMap2.containsValue("June")) {

			System.out.println(hashMap2.remove(2000, "June"));
			System.out.println(hashMap2);
		} else {
			System.out.println("No Item removed");
		}

		// retrieval thru entry or map view
		System.out.println(hashMap2.getOrDefault(3000, "NA")); // kapag may ganun key magdisplay yung value, kapag wala
																// yung nasa second arg ang lalabas

		Iterator<Entry<Integer, String>> iteratorEntry = hashMap2.entrySet().iterator();

		while (iteratorEntry.hasNext()) {
			Entry<Integer, String> tempEntry = iteratorEntry.next();
			Integer key = tempEntry.getKey();
			String value = tempEntry.getValue();
			System.out.println("%d %s".formatted(key, value));

		}

		// thru key view
		for (Integer lookupEntry : hashMap2.keySet()) {

			System.out.println("%d".formatted(lookupEntry));
		}

		// thru vaue view
		for (String lookupEntry : hashMap2.values()) {

			System.out.println("%s".formatted(lookupEntry));
		}

		BiFunction<Integer, String, String> modifyValue = new BiFunction<Integer, String, String>() {

			@Override
			public String apply(Integer t, String u) {
				return String.format("%s %s", u, "Human");
			}
		};

		hashMap2.compute(1000, modifyValue);
		hashMap2.compute(1, modifyValue);
		hashMap2.compute(2, modifyValue);
		hashMap2.compute(3, modifyValue);
		System.out.println(hashMap2);

		// disadvantages:
		// many exceptions, removes the current key and replace with a new value
		// replace is better as in papalitan mo lang yung value sa key
		// mag-remove or replace ka na lang wag na to kasi mas complicated na mas
		// mabigat pa sa performance

		System.out.println("==========================================================");
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> linkMap = new LinkedHashMap<Integer, String>(100);

		// individual insert
		linkMap.put(300, "Jamez");
		linkMap.put(1, "Venti");
		linkMap.put(2, "Balmond");
		linkMap.put(3, "Mattz");
		linkMap.put(-4, "Aulot");
		linkMap.put(3, "Clarkz");
		System.out.println(linkMap);

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		Map<Integer, String> tMap = new TreeMap<Integer, String>(new IntegerComparator()); // for sorting the keys, edi tthe comparator kung ascending or descending

		tMap.put(300, "Jamez");
		tMap.put(1, "Venti");
		tMap.put(2, "Balmond");
		tMap.put(3, "Mattz");
		tMap.put(-4, "Aulot");
		tMap.put(3, "Clarkz");
		System.out.println(tMap);

	}
}

class IntegerComparator implements Comparator<Integer> { // gawa ka lagi ganto kapag may sorting na kailangan para ready
															// sa sorting

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1.compareTo(o2) == 0) {
			return 0;
		} else if (o1.compareTo(o2) > 0) {
			return -2;
		}
		return 2;
	}
}
