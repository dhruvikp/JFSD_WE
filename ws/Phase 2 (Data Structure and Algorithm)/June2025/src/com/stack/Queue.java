package com.stack;

public class Queue {
	int[] arr;
	int front, rear, capacity;

	public Queue(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
	}

	public void enqueue(int data) {

		if (rear == capacity - 1) {
			System.out.println(" Queue Overflow");
			return;
		}

		rear = rear + 1;
		arr[rear] = data;
	}

	public int dequeue() {

		if (front > rear) {
			System.out.println("Queue underflow");
			return -1;
		}
		return arr[front++];
	}
	
	public void display() {
		System.out.print("Queue: ");
		for (int i=front; i<=rear; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
