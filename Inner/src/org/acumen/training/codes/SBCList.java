package org.acumen.training.codes;

import java.util.AbstractList;
//lahat ng mga lst may Abstract classes palitan mo ang word after Abstract
import java.util.Iterator;

public class SBCList<E> extends AbstractList<E> {

	@SuppressWarnings("unchecked")
	private E[] nameData = (E[]) new Object[0];

	@Override
	public int size() {
		try {
			return nameData.length;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return -1;
	}

	@Override
	public E get(int index) {
		try {
			return nameData[index];
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Iterator<E> iterator() {
		return super.iterator();
	}

	private class MyIterator<T> implements Iterator<T> {

		private int count;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (count < nameData.length) {
				return true;
			}
			return false;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			// TODO Auto-generated method stub
			return (T) nameData[count++];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			Iterator.super.remove();
		}

	}

}
