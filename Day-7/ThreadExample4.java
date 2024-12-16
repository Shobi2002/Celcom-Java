package com.day7;

class MyThread3 implements Runnable {
	

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is Running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadExample4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread3());
		t1.setName("T1");
		t1.start();
		System.out.println("Main end");
	}

}
