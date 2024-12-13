package com.day5;

//implement the interface extends
interface MyInterface1 {
	void myabstractMethod1();//default public and abstract
}
interface MyInterface2  extends MyInterface1 {
	void myabstractMethod2();
}

class MySubClass1 implements MyInterface2 {
	public void myabstractMethod1() {
		System.out.println("I am overriden method-1 of interface");
	}

	public void myabstractMethod2() {
		System.out.println("I am overridden method-2 of interface");
	}

	
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		MySubClass1 object = new MySubClass1();
		
		object.myabstractMethod1();
		object.myabstractMethod2();
		

	}

}


