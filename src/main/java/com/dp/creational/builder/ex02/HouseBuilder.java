package com.dp.creational.builder.ex02;

public interface HouseBuilder {
	void buildBasement();
	void buildRoof();
	void buildStructure();
	void buildInterior();
	House getHouse();	
}
