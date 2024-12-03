package org.acumen.training.codes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class MyAdt {

	public static void main(String[] args) {
		// abstratc data types
		Stack<String> bookTitles = new Stack<>();

		System.out.println(bookTitles.capacity());
		bookTitles.push("Harry POttah");
		bookTitles.push("Jack and the beanstalk");
		bookTitles.push("Alamat ng Pinya");
		bookTitles.push("Cinderrella");

		System.out.println(bookTitles);
		System.out.println(bookTitles.peek());
		System.out.println(bookTitles.pop());
		System.out.println(bookTitles.size());
		System.out.println(bookTitles.capacity());
		// no views kasi di namna makikitang maayos kun alin una ganun
		// no iterations din kasi nga dahil sa taas
		// no list kasi mawawalang kwenta yung FILO

		// if gudot mo ng FIFO, ito na yung totoo
		Queue<String> bookQueue = new ArrayDeque<>();

		bookQueue.add("Harry Roque pottah");
		bookQueue.add("Alamat ng Saging");
		bookQueue.add("Maria Makiling");
		bookQueue.add("Bulag, pipi at bingi");
		// no viewing , kasi panget tingnan
		// no a list

		// try-catch dito kasi kapag wala nang laman, error na
		System.out.println(bookQueue.element()); // just viewing
		System.out.println(bookQueue.remove()); // removing na
		System.out.println(bookQueue.element()); // just viewing
		System.out.println(bookQueue.remove()); // removing na
		System.out.println(bookQueue.element()); // just viewing
		System.out.println(bookQueue.remove()); // removing na
		System.out.println(bookQueue.element()); // just viewing
		System.out.println(bookQueue.remove()); // removing na

		Deque<String> pinoyPila = new ArrayDeque<String>();

		pinoyPila.addFirst("James");
		pinoyPila.addLast("Jiggs");
		
		//Deque pwede ka mag-add or remove kabilaang side, di lang filo fifo 

	}
}
