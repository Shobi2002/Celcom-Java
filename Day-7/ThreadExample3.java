package com.day7;

class MyThread2 extends Thread {
	public static Object suspend;

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() +" is Running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 t1 = new MyThread2();
		t1.setName("Thread 1");
		t1.start();
		
		t1.join();
		
		System.out.println("Main End");
	}

}
