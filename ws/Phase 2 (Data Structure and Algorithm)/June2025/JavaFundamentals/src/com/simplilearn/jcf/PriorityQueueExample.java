package com.simplilearn.jcf;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(30);
		pq.offer(10);
		pq.offer(20);
		
		System.out.println(pq.poll()); // smallest element
	}

}
