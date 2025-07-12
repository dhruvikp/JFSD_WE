package com.simplilearn.jcf;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {

	public static void main(String[] args) {

		Queue<String>  queue = new LinkedList<>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		System.out.println(queue);
		
		System.out.println(queue.poll()); // A
		System.out.println(queue.peek()); // B
		System.out.println(queue.poll()); // b
		
	}

}
