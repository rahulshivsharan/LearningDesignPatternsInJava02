package com.dp.creational.builder.ex02;

public class MudHouseBuilder implements HouseBuilder{

	private House house;
	
	public MudHouseBuilder() {
		house = new House();
	}
	
	public void buildBasement() {
		this.house.setBasement("Mud basement and Flooring");
	}

	public void buildRoof() {
		this.house.setRoof("Create dried grass roof");
	}

	public void buildStructure() {
		this.house.setStructure("Create Mud walls");
	}

	public void buildInterior() {
		this.house.setInterior("set basic stone furniture");
	}

	public House getHouse() {
		return this.house;
	}

}
