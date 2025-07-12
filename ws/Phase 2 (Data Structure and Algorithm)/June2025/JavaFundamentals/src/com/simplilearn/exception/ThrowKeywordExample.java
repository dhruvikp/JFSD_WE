package com.simplilearn.exception;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowKeywordExample {

	public static void main(String[] args) throws FileNotFoundException {
		Test t= new Test();
		
			try {
				t.divide(6, 0);
			} catch (DivideByZeroException e) {
				e.printStackTrace();
			}
		
	}
}


class Test {
	void divide(int a, int b) throws DivideByZeroException {
		if(b==0) throw new DivideByZeroException();
		System.out.println(a/b);
	}
}