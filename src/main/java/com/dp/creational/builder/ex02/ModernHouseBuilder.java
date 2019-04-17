package com.dp.creational.builder.ex02;

public class ModernHouseBuilder implements HouseBuilder{

	private House house;
	
	public ModernHouseBuilder() {
		this.house = new House();
	}
	
	public void buildBasement() {
		this.house.setBasement("Construct cement flooring, and ceramic tiling");
	}

	public void buildRoof() {
		this.house.setRoof("Construct Cement roof with terrace");
	}

	public void buildStructure() {
		this.house.setStructure("Build RCC structring with cement");
	}

	public void buildInterior() {
		this.house.setInterior("Add modern wooden furnitures");
	}

	public House getHouse() {
		return this.house;
	}

}
