package com.simplilearn.jcf;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "Ten");
		map.put(2, "Two");
		map.put(3, "Three");

		System.out.println(map.get(2));
		System.out.println(map.keySet());
		System.out.println(map.values());

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=>" + value);
		}
	}

}
