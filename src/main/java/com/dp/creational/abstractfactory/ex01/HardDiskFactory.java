package com.dp.creational.abstractfactory.ex01;

public class HardDiskFactory implements StorageAbstractFactory{
	
	private String storageType;
	private String totalMemory;
	private String fetchSpeed;
	
	public HardDiskFactory(String storageType,String totalMemory,String fetchSpeed) {
		this.storageType = storageType;
		this.totalMemory = totalMemory;
		this.fetchSpeed = fetchSpeed;
	}

	
	public Storage createStorageDevice() {
		return new HardDisk(this.storageType,this.totalMemory,this.fetchSpeed);
	}

}
