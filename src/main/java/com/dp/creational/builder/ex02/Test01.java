package com.dp.creational.builder.ex02;

public class Test01 {
	public static void main(String [] args) {
		HouseBuilder builder = null;
		CivilEngineer engineer = null;
		House house = null;
		try {
			builder = new MudHouseBuilder();
			engineer = new CivilEngineer(builder);
			engineer.contructHouse();
			house = engineer.getHouse();
			System.out.println(house);
			
			builder = new ModernHouseBuilder();
			engineer = new CivilEngineer(builder);
			engineer.contructHouse();
			house = engineer.getHouse();
			System.out.println(house);
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
