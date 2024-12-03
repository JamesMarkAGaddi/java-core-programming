package org.acumen.training.codes;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyProcessQueue {
	
	public static void main(String[] args) {
		
		//this is a process queue, the queue that is not queueing
		Queue<Integer> queue = new PriorityQueue<Integer>(); // not the queue ur thinking off
		//what is priority queue?
		//ginagamit dito sa process queue ay ang noting offer, so di sya add.
		 queue.offer(900);
		 queue.offer(1);
		 queue.offer(300);
		 queue.offer(20);
		 queue.offer(2);

		 // no viewing
		 // no for each or iterator
		 // no lists, so bawal add get ganern
		 
		 System.out.println(queue.peek());
		 System.out.println(queue.poll());
		 System.out.println(queue.peek());
		 System.out.println(queue.poll());
		 System.out.println(queue.peek());
		 System.out.println(queue.poll());
		 System.out.println(queue.peek());
		 System.out.println(queue.poll());
		 System.out.println(queue.peek());
		 System.out.println(queue.poll());
		 System.out.println(queue.peek());
		 
	}

}
