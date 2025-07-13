package com.simplilearn;

public class ThradLocal21 {
	static ThreadLocal<Integer> context = new ThreadLocal<Integer>();
	static final ScopedValue<String> contex1 = ScopedValue.newInstance();
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
			context.set((int)(Math.random()*100));
			System.out.println(Thread.currentThread().getName() + " "+ context.get());
			context.remove();
		};
		
		new Thread(task,"Thread-A").start();
		new Thread(task,"Thread-B").start();
		
		
		ScopedValue.where(contex1, "Hellow").run(() -> {
			System.out.println(contex1.get());
		});
		
		// Outside scope --> no value
		//System.out.println(contex1.get()); // throws exception 
		
	}
	
	public static void work() {
		
	}

}
