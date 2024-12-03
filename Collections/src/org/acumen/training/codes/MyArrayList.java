package org.acumen.training.codes;

import java.lang.reflect.Field;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.Size2DSyntax;

public class MyArrayList {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		List<Integer> listInts = new ArrayList<>(); // shadowing instantiation, panglist lang di kasama lahat ng under
													// sa arraylist
		ArrayList<Integer> listInts2 = new ArrayList<>(100);
		int countItems = listInts.size();
		System.out.println(countItems);
		int capacity = getCapacity(listInts);
		System.out.println(capacity);

		// adding elements sa arraylist
		// individual insertions
		listInts.add(10);
		listInts.add(20);
		listInts.add(30);
//so lumalaki agad ang capacity basta nagkalaman na sobrang loan agad
		countItems = listInts.size();
		System.out.println(countItems);
		capacity = getCapacity(listInts);
		System.out.println(capacity);

		listInts2.add(1000);
		listInts2.add(2000);
		listInts2.add(3000);
		listInts2.add(4000);
		listInts2.add(5000);
		listInts2.add(6000);
		listInts2.add(7000);
		listInts2.add(8000);
		System.out.println(listInts2.toString());
		// add lahat
		listInts.addAll(listInts2);
		System.out.println(listInts.toString());
		capacity = getCapacity(listInts);
		System.out.println(capacity);

		listInts.add(3, 11);
		System.out.println(listInts.toString());

		List<Integer> oddNUms = new ArrayList<Integer>();
		oddNUms.add(11);
		oddNUms.add(13);
		oddNUms.add(15);

		listInts.addAll(4, oddNUms);
		System.out.println(listInts.toString());

		listInts.set(0, -2);
		System.out.println(listInts);

		// removal
		listInts.remove(Integer.valueOf(11)); // AUTOBOXING
		System.out.println(listInts);

		List<Integer> forRemovals = new ArrayList<Integer>();
		forRemovals.add(11);
		forRemovals.add(1000);
		forRemovals.add(2000);
		forRemovals.add(3000);

		// conditional removal
		Predicate<Integer> filterEven = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0) {
					return true;
				}
				return false;
			}

		};
		listInts.removeIf(filterEven);
		System.out.println(listInts);

		// retrievals
		Integer first = listInts.get(0);
		System.out.println(first);

		// Iteration over looping here
		Iterator<Integer> iterator = listInts.iterator();
		while (iterator.hasNext()) {
			Integer tempInteger = iterator.next();
			System.out.println(tempInteger);
		}
		
		//other features
		Integer[] arrInts = listInts.toArray(new Integer[] {});
		System.out.println(Arrays.toString(arrInts));
		
		List<String> nameStrings = Arrays.asList("Anna", "Lorna"," Saltik"); //pwede ka gumamit ng panglagay neto pero di mo na sya pwede maedit
		nameStrings.set(0, "James");
		System.out.println(nameStrings);
	//	nameStrings.remove("Lorna");
		//System.out.print(nameStrings);
		
		//tingin ka lang ng part ng array
		List<Integer> subIntegers =   listInts.subList(1, listInts.size());
		System.out.println(subIntegers);

		listInts.retainAll(forRemovals);
		System.out.println(listInts);

		listInts.removeAll(forRemovals);
		System.out.println(listInts);

		// bulk removal
		System.out.println(listInts.hashCode());
		listInts.clear();
		System.out.println(listInts.hashCode());

	}

	public static int getCapacity(List<Integer> listInts) {

		Class<?> arrClass = listInts.getClass();
		try {
			Field arrDataField = arrClass.getDeclaredField("elementData");
			arrDataField.setAccessible(true);
			Object[] capacity = (Object[]) arrDataField.get(listInts);
			return capacity.length;
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return 0;
	}

}
