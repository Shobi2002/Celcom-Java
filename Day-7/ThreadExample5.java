package com.day7;

class TwoTable implements Runnable {
	

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " * 2 = " +(i*2));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class FiveTable extends Thread {
	

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.err.println("\t" +i + " * 5 = " +(i*5));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new TwoTable());
		t1.setName("Two");
		t1.start();
		
		FiveTable t2 = new FiveTable();
		t2.setName("Five");
		t2.start();
		
		

	}

}
