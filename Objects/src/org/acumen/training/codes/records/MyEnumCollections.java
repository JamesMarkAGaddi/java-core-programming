package org.acumen.training.codes.records;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyEnumCollections {

	private enum Flower {
		ROSE, SAMPAGUITA, SANTAN
	};

	public static void main(String[] args) {

		// Choose two flowers
		// kapag pwedeng may repeat, we use List
		List<Flower> basket = new ArrayList<>();
		basket.add(Flower.ROSE);
		basket.add(Flower.SAMPAGUITA);

		System.out.println(basket);

		Set<Flower> basket2 = EnumSet.noneOf(Flower.class); // bawal ang hashset ganto dapat kapag gagawa ka ng set sa
															// enum
		basket2.add(Flower.ROSE);
		basket2.add(Flower.SANTAN);
		basket2.add(Flower.ROSE);
		basket2.add(Flower.SAMPAGUITA);
		System.out.println(basket2);
		
		//inverntory of flowers , not a map kahit may keys
		Map<Flower, Double> inventoryMap = new EnumMap<MyEnumCollections.Flower, Double>(Flower.class);
		inventoryMap.put(Flower.ROSE, 10000.00);
		inventoryMap.put(Flower.SAMPAGUITA, 5000.00);
		inventoryMap.put(Flower.SANTAN, 00.00);
		System.out.println(inventoryMap);

	}

}
