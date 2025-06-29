package com.simplilearn.oops;

public class EncapsulationExample {

	public static void main(String[] args) {
		BankAccount ba  = new BankAccount();
		//System.out.println(ba.balance);
		
		ba.setBalance(1000);
		ba.getBalance();
		ba.deposit(1000);
		

	}

}


class BankAccount {
	private double balance;
	
	
	public void deposit(double amount) {
		if(amount >= 0) balance += amount;
		
	} 
	
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
