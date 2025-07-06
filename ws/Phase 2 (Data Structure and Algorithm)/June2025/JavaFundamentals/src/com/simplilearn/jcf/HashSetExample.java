package com.simplilearn.jcf;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Apple");
		set.add("Cherry");
		
		System.out.println(set);

	}

}
