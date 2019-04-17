package com.dp.creational.builder.ex02;

public class CivilEngineer {
	
	private HouseBuilder builder;
	
	public CivilEngineer(HouseBuilder builder) {
		this.builder = builder;
	}
	
	public House getHouse() {
		return this.builder.getHouse();
	}
	
	public void contructHouse() {
		this.builder.buildStructure();
		this.builder.buildBasement();
		this.builder.buildRoof();
		this.builder.buildInterior();
	}
}
