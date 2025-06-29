package com.simplilearn.oops;

public class InheritanceExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat();
		dog.bark();

	}

}

class Animal {
	
	void eat() {
		System.out.println("THis animal eats food.");
	}
}

class Dog extends Animal {
	
	void bark() {
		System.out.println("This dog is barking..");
	}
	
}