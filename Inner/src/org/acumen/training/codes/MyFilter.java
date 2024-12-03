package org.acumen.training.codes;

public class MyFilter {

	@SuppressWarnings("unchecked")
	public static <E extends CharSequence> E[] apply(E[] items, IFilter<E> f) {

		if (items instanceof String[]) {
			String[] result = new String[items.length];
			String[] itemStr = (String[]) items;

			int counter = 0;
			for (String lookup : itemStr) {
				if (f.accept((E) lookup)) {
					result[counter] = (String) lookup;
					counter++;
				}
			}
			return (E[]) result;
		}
		return null;
	}

}
