package com.simplilearn.oops.access2;

import com.simplilearn.oops.access1.DefaultAccessSpecifierExample;
import com.simplilearn.oops.access1.Parent;

public class AnotherClass2 {

	public static void main(String[] args) {
		DefaultAccessSpecifierExample ex = new DefaultAccessSpecifierExample();
		//ex.message(); // Outside of package method nt accessible.

	}

}


class Child extends Parent {
	void display() {
		show(); // ALlowd due to inheritance
	}
}