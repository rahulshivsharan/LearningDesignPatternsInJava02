package com.dp.behavioral.stratagy.ex01;

public class MainTest {

	public static void main(String[] args) {
		Item [] items = new Item[] {
			new Item("Head Phones","345543","234"),
			new Item("T-Shirt","1543","1200"),
			new Item("Shoes","768","2500")
		};
		
		ShoppingCart cart = new ShoppingCart();
		
		for(Item item : items) {
			cart.addItem(item);
		}
		
		cart.pay(new InternetBanking("razjiv", "Kitfflt353"));
	}

}
