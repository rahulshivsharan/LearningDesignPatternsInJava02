package com.dp.behavioral.stratagy.ex01;

public class InternetBanking implements PaymentStratagy{
	
	
	private String userName;
	private String password;
	
	
	public InternetBanking(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public void pay(int amount) {
		System.out.println("Amount "+amount+", paid using Net Banking");
	}
	
	
}
