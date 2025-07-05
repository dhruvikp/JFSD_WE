package com.simplilearn.statickeyword;

public class StaticBlock {
	static int  x;
	int y;
	
	static {
		x=10;
		System.out.println("Static block executed: Value of x : "+x);
		
		// Class Loader will load class
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Main in invoked");
		
		StaticBlock block = new StaticBlock();
	}

}
