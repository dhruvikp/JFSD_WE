package com.simplilearn.finalkeyword;

public class FinalMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent {
	final void display() {
		System.out.println("Parent display..");
	}
}

class Child extends Parent {
//	void display() {
//	}
}
