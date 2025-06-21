package com.stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.display();
		
		System.out.println(stack.pop());
		stack.display();
		
		System.out.println(stack.pop());
		stack.display();
		

	}

}
