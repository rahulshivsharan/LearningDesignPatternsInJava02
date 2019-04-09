package com.dp.creational.singleton.ex03;

public class DataSource {
	
	private Object connection;
	
	public DataSource() {
		System.out.println("Datasource initialised by "+Thread.currentThread().getName());
		connection = "Connected";
	}
	
	public Object getConnection() {
		return this.connection;
	}
}
