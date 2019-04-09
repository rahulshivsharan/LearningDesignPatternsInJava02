package com.dp.creational.singleton.ex03;

public class Test01 {

	public static void main(String[] args) {
		Thread[] threads = null;
		Runnable myRunnable = null;
		try {
			
			myRunnable = new Runnable() {
				
				public void run() {
					DataSource ds = ServiceBean.INSTANCE.getDataSource();					
				}
			};
			threads = new Thread[] {
				new Thread(myRunnable,"Thread-01"),
				new Thread(myRunnable,"Thread-02"),
				new Thread(myRunnable,"Thread-03"),
				new Thread(myRunnable,"Thread-04"),
				new Thread(myRunnable,"Thread-05")
			};
			
			for(Thread t : threads) {
				t.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
