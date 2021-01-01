package com.dp.behavioral.stratagy.ex01;

public class Item {
	private String itemName;
	private String itemCode;
	private String price;
	
	public Item(String itemName, String itemCode, String price) {
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public String getPrice() {
		return price;
	}
	
	@Override
	public int hashCode() {
		Integer itemCode = Integer.parseInt(this.itemCode);		
		itemCode *= 31;
		itemCode *= 7;		
		return itemCode;
	}
	
	public boolean equals(Object o) {
		boolean flag = false;
		Item itemObject = null;
		if(o instanceof Item) {
			itemObject = (Item) o;
			if (this.itemCode.equals(itemObject.getItemCode()) && (this.hashCode() == itemObject.hashCode())) {
				flag = true;
			}
		}
		
		return flag;
	}
}
