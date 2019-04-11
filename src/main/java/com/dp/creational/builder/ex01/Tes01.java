package com.dp.creational.builder.ex01;

public class Tes01 {

	public static void main(String[] args) {
		String msg = null;
		Computer computerObj = null;
		try {
			computerObj = new Computer.ComputerBuilder("SATA 500 GB Hard-disk","8 GB DDR3 RAM")
										.setIsGraphicEnabled(true).build();
			
			System.out.println(computerObj);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
