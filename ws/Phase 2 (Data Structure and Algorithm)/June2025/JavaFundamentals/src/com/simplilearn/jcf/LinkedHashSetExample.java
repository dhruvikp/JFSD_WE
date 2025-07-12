package com.simplilearn.jcf;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Apple");
		set.add("Cherry");
		
		System.out.println(set);
		
	}

}
