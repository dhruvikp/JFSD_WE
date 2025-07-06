package com.simplilearn.jcf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("Banana");
		list.add("Apple");
		list.add(1,"Cherry");
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String fruit : list) {
			System.out.println(fruit);
		}
		
		
		System.out.println(list.get(2));
		
		
		
		
	}

}
