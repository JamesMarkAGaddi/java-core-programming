package org.acumen.training.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyFrozenCollections {
	// will be used to freeeze before ireturn sa mga getter para di maalter ng kahit
	// sino
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

//		// old way of freezing your lists, sets, and maps
//		System.out.println(Collections.unmodifiableList(list));
//		list.remove(10); // you cannot remove or add anything in the list
//
//		// new one unmodifiableList
//		list = List.copyOf(list);
//		list.remove(10); // you cannot remove or add anything in the list

		// how to unfreeze of resue he unuseable
		// list = new ArrayList<Integer>();
		
		
		
		
	}

}
