package com.dp.creational.builder.ex02;

public class House implements HousePlan{

	private String basement;
	private String structure;
	private String roof;
	private String interior;
	
	public void setBasement(String basement) {
		this.basement = basement;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String toString() {
		StringBuffer strb = new StringBuffer();
					strb.append(this.basement).append(", ")
						.append(this.structure).append(", ")
						.append(this.roof).append(", ")
						.append(this.interior);
		return strb.toString();
	}
}
