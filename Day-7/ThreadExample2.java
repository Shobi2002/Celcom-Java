package com.day7;

class MyThread1 extends Thread {
	public static Object suspend;

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

public class ThreadExample2  {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("Thread 1");
		t1.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		try {
			t1.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t1.notifyAll();

	}

}
