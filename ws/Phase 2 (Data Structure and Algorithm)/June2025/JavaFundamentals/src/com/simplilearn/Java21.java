package com.simplilearn;

import java.lang.foreign.MemorySegment;
import java.util.LinkedHashMap;
import java.util.SequencedMap;

record Point(int x, int y) {
}

public class Java21 {

	public static void main(String[] args) throws InterruptedException {

		Object obj = 42;

		String result = switch (obj) {

		case Integer i when i > 0 -> "Positive integer: " + i;
		case null -> "Its null";
		case String s when s.length() > 5 -> "Long String " + s;
		default -> "Unknown type";

		};

		System.out.println(result);

		// Record Pattern

		Object ob = new Point(3, 4);

		switch (ob) {
		case Point(int x, int y) -> System.out.println("X = " + x + ",y=" + y);
		default -> System.out.println("Not a point");
		};

		//
//		if(ob instanceof Point(int x,_)) {
//			
//		}
	
		
		
		// virtual thread
		
		Runnable task = () -> {
			System.out.println("Running on thread: "+ Thread.currentThread());
		};
		
		Thread vt = Thread.ofVirtual().start(task);
		vt.join();
		
		// Sequenced Collections
		
		SequencedMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		System.out.println("First entry: "+ map.firstEntry());
		System.out.println("First entry: "+ map.lastEntry());
		
		
//		MemorySegment segment = MemorySegment.
		
	}
}