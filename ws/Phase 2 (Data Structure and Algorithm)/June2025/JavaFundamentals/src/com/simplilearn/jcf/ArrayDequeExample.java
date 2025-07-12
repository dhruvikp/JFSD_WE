package com.simplilearn.jcf;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {

		ArrayDeque<String> dequeue = new ArrayDeque<String>();
		dequeue.offer("X");
		dequeue.offer("Y");
		dequeue.offer("Z");
		
		System.out.println(dequeue);
		
		System.out.println(dequeue.offerFirst("W"));
		System.out.println(dequeue);
		System.out.println(dequeue.pollLast());
		System.out.println(dequeue);
	}

}
