package com.simplilearn.constructor;

public class ConstructorExample {

	public static void main(String[] args) {
		Car c = new Car("A6");
		System.out.println(c.displayModel());
		
		Test t = new Test();

		Dog d = new Dog();
		
		
		Student rohit = new Student("rohit", 40);
		
		Student rahul = new Student(rohit);
		
		System.out.println(rahul.name);
	}

}

class Car {
	String model;
	
	public Car(String m) {
		super();
		this.model = m;
	}
	
	public String displayModel() {
		return this.model;
	}
}

class Test {
	public Test() {
		//super();
	}
	
	Test(int a) {
		
	}
}

// java.lang.Object

class Animal {
	Animal() {
		super();
		System.out.println("Animal Constructor");
	}
} 

class Dog extends Animal {
	Dog() {
		super();
		System.out.println("Dog Constructor");
	}
}


class Pen {
	String refill;
	
	Pen(String refill) {
		this.refill = refill;
	}
	
	Pen() {
		
	}
}

class Cello extends Pen {

	public Cello() {
		//super("blue");
	}
}


class Student {
	
	String name;
	int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// Copy constructor
	Student(Student s) {
		this.name = s.name;
		this.age = s.age;
	}
}



















