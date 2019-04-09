package com.dp.creational.singleton.ex01;

public class Test01 {

	public static void main(String[] args) {
		Runnable myRunnable = null;
		Thread [] threads = null;
		try {
			myRunnable = new Runnable() {
				
				public void run() {
					ServiceBean bean = ServiceBean.getInstance(); 
				}
			};
			
			threads = new Thread[] {
					new Thread(myRunnable,"Thread-01"),
					new Thread(myRunnable,"Thread-02"),
					new Thread(myRunnable,"Thread-03"),
					new Thread(myRunnable,"Thread-04")
			};
			
			for(Thread t : threads) {
				t.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
