package com.stack;

public class Stack {
	int[] arr;
	int capacity;
	int top;
	
	public Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int data) {
		
		if(top == capacity -1) {
			System.out.println("Stack is overflow");
			return;
		}
		top = top +1 ;
		arr[top] = data;
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("Stack underflow!");
			return -1;
		}
		return arr[top--];
	}
	
	public void display() {
		System.out.print("Stack :");
		for(int i=top; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
