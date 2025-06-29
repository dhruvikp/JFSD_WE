package com.simplilearn.oops;

public class PolymorphismExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(5, 5);
		calc.add(6, 6,7);
		
		
		Cat c = new Cat();
		c.sound();
		
		AnimalClass animal = new Cat();
		animal.sound();
		
		AnimalClass c2 = new AnimalClass();
		c2.sound();
	}

}

class Calculator {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}


class AnimalClass {
	void sound() {
		System.out.println("ANimal makes a sound");
	}
}

class Cat extends AnimalClass {
	void sound() {
		System.out.println("Cat meows");
	}
}
