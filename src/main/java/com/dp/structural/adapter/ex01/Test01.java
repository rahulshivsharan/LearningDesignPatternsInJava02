package com.dp.structural.adapter.ex01;

public class Test01 {

	public static void main(String[] args) {
		Volt volts3 = null;
		Volt volts12 = null;
		Volt volts120 = null;
		SocketAdapter adapter = null;
		try {
			adapter = new SocketAdapterImpl();
			
			volts3 = getVolt(adapter, 3);
			volts12 = getVolt(adapter, 12);
			volts120 = getVolt(adapter, 120);
			
			System.out.println(volts3);
			System.out.println(volts12);
			System.out.println(volts120);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static Volt getVolt(SocketAdapter adapter,int volt) {
		Volt v = null;
		
		switch (volt) {
			case 3:		
				v = adapter.get3Volt();
				break;
			
			case 12:
				v = adapter.get12Volt();
				break;
			
			case 120:
				v = adapter.get120Volt();
				break;
			
			default:
				v = adapter.get120Volt();			
		}
		
		return v;
	}

}
