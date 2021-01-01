package com.dp.behavioral.stratagy.ex01;

public class CreditCardStrategy implements PaymentStratagy{
	
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpery;
	
	public CreditCardStrategy(String name,String cardNumber, String cvv, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpery = dateOfExpiry;
	}
	
	
	public void pay(int amount) {
		System.out.println("Amount "+amount+", paid using Credit Card");
	}
}
