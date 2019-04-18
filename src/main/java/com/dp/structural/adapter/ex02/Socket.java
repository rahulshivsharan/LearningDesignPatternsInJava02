package com.dp.structural.adapter.ex02;

public class Socket {
	
	public Volt getVolt() {
		/**
		 * Get Default socket of 120 Volts
		 */
		return new Volt(120);
	}
}
