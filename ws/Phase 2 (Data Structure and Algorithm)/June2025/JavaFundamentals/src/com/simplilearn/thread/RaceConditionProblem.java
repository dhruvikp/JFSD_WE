package com.simplilearn.thread;

public class RaceConditionProblem {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread (() -> {
			for(int i=0; i<1000; i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread (() -> {
			for(int i=0; i<1000; i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		//t1.join();
		//t2.join();
		
		Thread.sleep(1000);
		
		System.out.println(c.count);

	}

}

class Counter {
	int count = 0;
	
	 void increment() {
		 synchronized(this) {
				//System.out.println(Thread.currentThread().getName() +":"+ count);
				count++;
		 }

	}
	 
	 synchronized void test() {
		 System.out.println(count);
	 }
}
