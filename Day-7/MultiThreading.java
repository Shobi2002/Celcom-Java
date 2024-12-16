package com.day7;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() +" is Running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			return;
		}
	}
}

public class MultiThreading {

	
	public static void main(String[] args) throws InterruptedException {
		MyThread t2 = new MyThread();
		t2.setName("Thread 1");
		t2.start();
	
		t2.interrupt();
		t2.isAlive();
		MyThread t3 = new MyThread();
		t3.setName("Thread 2");
		t3.start();
		
		
		
		System.out.println("Main End");
		t2.yield();
		Thread t = Thread.currentThread();
		Thread t1 = new Thread();
		System.out.println(t1);
		System.out.println(t);
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.isDaemon());
		System.out.println(t.getState());
		System.out.println(t.getThreadGroup());

	}

}
