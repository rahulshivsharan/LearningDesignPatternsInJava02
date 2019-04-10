package com.dp.creational.abstractfactory.ex01;

public class RAMFactory implements StorageAbstractFactory{

	private String storageType;
	private String totalMemory;
	private String fetchSpeed;
	
	public RAMFactory(String storageType,String totalMemory,String fetchSpeed) {
		this.storageType = storageType;
		this.totalMemory = totalMemory;
		this.fetchSpeed = fetchSpeed;
	}
	
	public Storage createStorageDevice() {
		return new RAM(this.storageType,this.totalMemory,this.fetchSpeed);		
	}
	
}
