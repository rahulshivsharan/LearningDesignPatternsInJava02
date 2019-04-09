package com.dp.creational.singleton.ex01;

public class ServiceBean {
	
	private static ServiceBean INSTANCE;
	private ServiceBean() {
		System.out.println(this.getClass().getName()+" is initialised by thread "+Thread.currentThread().getName());
	}
	
	static {
		ServiceBean.INSTANCE = new ServiceBean();
	}
	
	public static ServiceBean getInstance() {
		return ServiceBean.INSTANCE;
	}
}
