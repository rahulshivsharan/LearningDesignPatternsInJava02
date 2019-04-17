package com.dp.structural.adapter.ex01;

public class Volt {
	private int volt;
	
	public Volt(int volt) {
		this.volt = volt;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}
	
	public String toString() {
		StringBuffer strb = new StringBuffer();
		strb.append("Socket emits ").append(this.volt).append(" voltages of electricity");
		return strb.toString();
	}
}
