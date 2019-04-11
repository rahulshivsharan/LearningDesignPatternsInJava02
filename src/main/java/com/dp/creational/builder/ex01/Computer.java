package com.dp.creational.builder.ex01;

public class Computer {
	// Required Parameters
	private String HDD;
	private String RAM;
	
	// Optional Parameters
	private Boolean isGraphicCardEnabled;
	private Boolean isBluetoothEnabled;
	
	/**
	 * Computer Object can only be
	 * created from its builder hence contructor is private 
	 */
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicCardEnabled = builder.isGraphicEnabled;
	}
	
	// all getters of properties
	public String getHDD() {
		return HDD;
	}
	
	public String getRAM() {
		return RAM;
	}
	
	public Boolean getIsGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}
	
	public Boolean getIsBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	public String toString() {
		String msg = null;
		StringBuilder builder = new StringBuilder();
		
		builder.append("Computer is build with following configuration, \n")
				.append("Hard-disk size is ").append(this.HDD).append(",\n")
				.append("RAM is ").append(this.RAM).append(",\n")
				.append("Is Graphic's Card installed ? ").append(this.isGraphicCardEnabled).append(",\n")
				.append("Is Bluetooth installed ? ").append(this.isBluetoothEnabled).append(".");
		
		msg = builder.toString();
		return msg;
	}
	
	/**
	 * Builder class whose responsibility is to build Computer object,
	 * hence its an inner class
	 */
	public static class ComputerBuilder{		
		//Required Parameters
		private String HDD;
		private String RAM;
		
		//Optional Parameters
		private Boolean isGraphicEnabled = false;
		private Boolean isBluetoothEnabled = false;
		
		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}

		// Setters only for Optional Parameters
		public ComputerBuilder setIsGraphicEnabled(Boolean isGraphicEnabled) {
			this.isGraphicEnabled = isGraphicEnabled;
			return this;
		}

		public ComputerBuilder setIsBluetoothEnabled(Boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		/*
		 * Builder method whose responsibility is 
		 * to build the Computer Object
		 */
		public Computer build() {
			return new Computer(this);
		}
		
	}
}
