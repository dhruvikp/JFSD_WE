package com.simplilearn.aop.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	public String processPayment(String user, double amount) {
		System.out.println("Processing payment for user: "+ user +" Of amount: "+amount);
		if(amount <=0) {
			throw new IllegalArgumentException("Invalid payment amount");
		}
		return "Payment of "+ amount+" for "+ user +" successful.";
	}
}
