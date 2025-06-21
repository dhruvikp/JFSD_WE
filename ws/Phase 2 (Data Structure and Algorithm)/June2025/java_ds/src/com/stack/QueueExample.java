package com.stack;

public class QueueExample {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		queue.display();
		
		System.out.println(queue.dequeue());
		queue.display();
		
		

	}

}
