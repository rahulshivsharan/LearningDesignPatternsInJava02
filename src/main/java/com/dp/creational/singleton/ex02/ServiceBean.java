package com.dp.creational.singleton.ex02;

public class ServiceBean {
	
	
	private ServiceBean() {
		System.out.println(this.getClass().getName()+" is initialised by thread "+Thread.currentThread().getName());
	}
	
	public static ServiceBean getInstance() {
		return BeanInitializer.INSTANCE;
	}
	
	/**
	 * 
	 * @author rahulshivsharan
	 * 
	 * Inner static private class.
	 * Its job is to just initialise bean.
	 *
	 */
	private static class BeanInitializer{
		private static final ServiceBean INSTANCE = new ServiceBean();
	}
}
