package org.acumen.training.codes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
	public static void main(String[] args) {
		List<Integer> linkList = new LinkedList<Integer>();
		List<Integer> arraylist = new ArrayList<Integer>();

		MyLinkedList mLinkedList = new MyLinkedList();
		mLinkedList.populate(arraylist);
		mLinkedList.populate(linkList);

		mLinkedList.traverse(arraylist);
		mLinkedList.traverse(linkList);

		mLinkedList.update(arraylist);
		mLinkedList.update(linkList);
		
		mLinkedList.remove(arraylist);		
// arraylist to linkedlist convertion
		LinkedList<Integer> tempIntegers = new LinkedList<Integer>(arraylist);
		mLinkedList.remove(tempIntegers);
		arraylist.clear();
		arraylist.addAll(tempIntegers);
		tempIntegers = null;

		mLinkedList.insert(arraylist);
		mLinkedList.insert(linkList);

	}

	public void populate(List<Integer> list) {

		long start = System.nanoTime();
		for (int i = 0; i < 50000; i++) {
			list.add(i);
		}

		long elapsed = System.nanoTime() - start;
		System.out.println(elapsed);
	}

	public void traverse(List<Integer> list) {

		long start = System.nanoTime();
		for (int i = 0; i < 50000; i++) {
			list.get(i);
		}

		long elapsed = System.nanoTime() - start;
		System.out.println(elapsed);
	}

	public void update(List<Integer> list) {

		long start = System.nanoTime();
		for (int i = 10000; i < 30000; i++) {
			list.set(i, -1);
		}

		long elapsed = System.nanoTime() - start;
		System.out.println(elapsed);
	}

	public void remove(List<Integer> list) {

		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list.remove(3000);
		}

		long elapsed = System.nanoTime() - start;
		System.out.println(elapsed);
	}

	public void insert(List<Integer> list) {

		long start = System.nanoTime();
		for (int i = 0; i < 20000; i++) {
			list.add(i, 30000);
		}

		long elapsed = System.nanoTime() - start;
		System.out.println(elapsed);
	}
	
	
}
