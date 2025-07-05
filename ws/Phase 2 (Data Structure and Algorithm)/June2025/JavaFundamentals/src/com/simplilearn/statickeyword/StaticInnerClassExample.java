package com.simplilearn.statickeyword;

public class StaticInnerClassExample {

	public static void main(String[] args) {
		
		
		int a =5;
		
		Outer.Pen pen  = new Outer.Pen();
		pen.write();
		
		
		Outer.Pen Redpen  = new Outer.Pen();
		Redpen.write();
		

	}

}

class Outer {
	
	static class Pen {
		String refill;
		
		void write() {
			int b=5;
			
			System.out.println("Inside static nested class");
			write2();
			
			
			//System.gc();
			
		}
		
		void write2() {
			//Calc c = new calc();
		}
	}
}
