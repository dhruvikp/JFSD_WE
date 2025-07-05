package com.simplilearn.thread;

public class ThreadUnderstanding {

	public static void main(String[] args) {
		Thread t1 = new Thread(new DemoThread());
		t1.start();

		System.out.println("Main thread execution");
	}
}

class DemoThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
