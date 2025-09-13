package com.simplilearn.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.aop.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/{user}/{amount}")
	public String pay(@PathVariable String user, @PathVariable double amount) {
		return paymentService.processPayment(user, amount);
	}
}
