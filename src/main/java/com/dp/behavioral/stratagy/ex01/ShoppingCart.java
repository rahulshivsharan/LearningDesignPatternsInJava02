package com.dp.behavioral.stratagy.ex01;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> itemList;
	
	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.itemList.add(item);
	}
	
	public void removeItem(Item item) {
		this.itemList.remove(item);
	}
	
	public int calculateTotal() {
		int total = 0;
		for(Item item : this.itemList) {
			total += Integer.parseInt(item.getPrice());
		}
		
		return total;
	}
	
	public void pay(PaymentStratagy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}
