package com.dp.creational.abstractfactory.ex01;

public abstract class Storage {
	public abstract String getStorageType();
	public abstract String getTotalMemory();
	public abstract String getFetchSpeed();
	
	@Override
	public String toString() {
		StringBuffer strb = new StringBuffer();
		
		strb.append(this.getStorageType())
			.append(" can hold ")
			.append(this.getTotalMemory())
			.append(" of data, which can be read at ")
			.append(this.getFetchSpeed());
		
		return strb.toString();
	}
}
