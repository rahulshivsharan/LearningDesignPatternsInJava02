package com.dp.structural.adapter.ex01;

public class SocketAdapterImpl extends Socket implements SocketAdapter{

	public Volt get120Volt() {
		return getVolt();
	}

	public Volt get12Volt() {
		Volt v = getVolt();
		v = convertVolt(v, 10);
		return v;
	}

	public Volt get3Volt() {
		Volt v = getVolt();
		v = convertVolt(v, 40);
		return v;
	} 

	private Volt convertVolt(Volt v, int i) {
		int calculatedVolt = v.getVolt()/ i;
		Volt convertedVolt = new Volt(calculatedVolt);
		return convertedVolt;
	}
}
