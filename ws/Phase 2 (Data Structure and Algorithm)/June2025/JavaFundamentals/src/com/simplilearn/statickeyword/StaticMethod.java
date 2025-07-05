package com.simplilearn.statickeyword;

public class StaticMethod {

	public static void main(String[] args) {

		System.out.println(MathUtils.add(4, 5));
	}
	


}


class MathUtils {
	static int add(int a, int b) {
		return a+b;
	}
}
