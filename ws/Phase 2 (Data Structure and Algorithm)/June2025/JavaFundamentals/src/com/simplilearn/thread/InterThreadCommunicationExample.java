package com.simplilearn.thread;

public class InterThreadCommunicationExample {

	public static void main(String[] args) {

		Customer c = new Customer();

		Thread withdrawThread = new Thread(() -> {
			c.withdraw(15000);
		});
		withdrawThread.start();
		
		
		Thread depositThread = new Thread(() -> {
			c.deposit(15000);
		});
		depositThread.start();
	}

}

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw..");

		if (this.amount < amount) {
			System.out.println("Less balance, waiting for deposit..");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Withdraw is done.");
		}
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit...");
		this.amount += amount;
		System.out.println("Deposit completed");
		this.notify();
	}
}
