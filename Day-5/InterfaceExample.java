package com.day5;

 interface MyInterface {
	void myabstractMethod1();

	void myabstractMethod2();

}

class MySubClass implements MyInterface {
	public void myabstractMethod1() {
		System.out.println("I am overriden method-1 of interface");
	}

	public void myabstractMethod2() {
		System.out.println("i am overridden method-2 of interface");
		;
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		MyInterface object = new MySubClass();
		object.myabstractMethod1();
		object.myabstractMethod2();

	}

}
