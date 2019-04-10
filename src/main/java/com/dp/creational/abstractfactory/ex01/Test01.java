package com.dp.creational.abstractfactory.ex01;

public class Test01 {
	public static void main(String [] args) {
		Storage storage = null;
		try {
			storage = StorageFactory.createStorage(new HardDiskFactory("SATA HDD","500 GB" ,"2000 Mbps"));
			System.out.println(storage);
			
			storage = StorageFactory.createStorage(new RAMFactory("SSD RAM","8 GB" ,"6400 Mbps"));
			System.out.println(storage);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
