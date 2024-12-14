package com.day6;

interface In1 {
	final int a = 10;

	default void display() {
		System.out.println("hello");
	}
}

// A class that implements the interface.

public class Example implements In1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example t = new Example();
		System.out.println(a);
		t.display();

	}

}
