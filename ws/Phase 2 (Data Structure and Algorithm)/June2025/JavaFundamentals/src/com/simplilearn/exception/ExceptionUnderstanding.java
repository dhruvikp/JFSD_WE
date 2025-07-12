package com.simplilearn.exception;

public class ExceptionUnderstanding {

	public static void main(String[] args) {
		
		int a= 1;
		int b = 1;

		try {
			System.out.println(a/b);	
		} catch(ArithmeticException e) {
			System.out.println("Number can not be divided by zero");
		} catch(Exception e)  {
			
		}
		finally {
			System.out.println("This always runs");
		}
		
		
		System.out.println("Hello there..!");
		
		//test();
	}
	
	private static void test() {
		test();
	}

}


