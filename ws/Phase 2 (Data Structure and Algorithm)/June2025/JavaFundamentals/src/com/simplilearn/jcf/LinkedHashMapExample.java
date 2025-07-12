package com.simplilearn.jcf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map= new LinkedHashMap<Integer, String>();
		map.put(1, "One");
		map.put(2,"Two");
		map.put(3, "Three");
		
		System.out.println(map.get(2));
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
