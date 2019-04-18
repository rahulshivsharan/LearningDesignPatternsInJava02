package com.dp.structural.adapter.ex02;

public class SocketAdapterImpl implements SocketAdapter{
	
	private Socket socket;
	
	public SocketAdapterImpl() {
		this.socket = new Socket();
	}

	public Volt get120Volt() {
		return this.socket.getVolt();
	}

	public Volt get12Volt() {
		Volt v = this.socket.getVolt();
		v = convertVolt(v, 10);
		return v;
	}

	public Volt get3Volt() {
		Volt v = this.socket.getVolt();
		v = convertVolt(v, 40);
		return v;
	} 

	private Volt convertVolt(Volt v, int i) {
		int calculatedVolt = v.getVolt()/ i;
		Volt convertedVolt = new Volt(calculatedVolt);
		return convertedVolt;
	}
}
