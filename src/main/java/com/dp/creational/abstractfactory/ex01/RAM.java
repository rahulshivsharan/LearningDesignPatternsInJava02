package com.dp.creational.abstractfactory.ex01;

public class RAM extends Storage{

	private String storageType;
	private String totalMemory;
	private String fetchSpeed;
	
	public RAM(String storageType,String totalMemory,String fetchSpeed) {
		this.storageType = storageType;
		this.totalMemory = totalMemory;
		this.fetchSpeed = fetchSpeed;
	}
	
	@Override
	public String getStorageType() {
		return this.storageType;
	}

	@Override
	public String getTotalMemory() {
		return this.totalMemory;
	}

	@Override
	public String getFetchSpeed() {
		return this.fetchSpeed;
	}

}
