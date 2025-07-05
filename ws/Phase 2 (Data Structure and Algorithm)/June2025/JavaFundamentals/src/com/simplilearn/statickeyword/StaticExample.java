package com.simplilearn.statickeyword;

public class StaticExample {

	public static void main(String[] args) {
		Student student= new Student(1);
		student.display();

		System.out.println(Student.schoolName);
	}

}

class Student {
	int rollNo;

	static String schoolName = "GreenApple high school";

	Student(int roll) {
		this.rollNo = roll;
	}

	void display() {
		System.out.println("Roll No: "+ this.rollNo + ", School: "+Student.schoolName);
	}
}