package com.dp.creational.singleton.ex03;

public enum ServiceBean {
	
	INSTANCE;
	private DataSource ds;
	
	/**
	 * enum constructor....
	 */
	private ServiceBean() {
		ds = new DataSource();
	}
	
	public DataSource getDataSource() {
		return this.ds;
	}
}
