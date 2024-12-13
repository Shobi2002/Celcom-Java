package com.day5;
//implement the multiple interface
interface MyInterfaceone {
	void myabstractMethod1();//default public and abstract
}
interface MyInterfacetwo {
	void myabstractMethod2();
}

class MySubClassone implements MyInterfaceone,MyInterfacetwo {
	public void myabstractMethod1() {
		System.out.println("I am overriden method-1 of interface");
	}

	public void myabstractMethod2() {
		System.out.println("i am overridden method-2 of interface");
	}

	void method() {
		
		
	}
}
class SubClass2 extends MySubClassone{
	public void method() {
		System.out.println("It is extends class of My subclass");
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		MySubClassone object = new MySubClassone();
		
		object.myabstractMethod1();
		object.myabstractMethod2();
		object = new SubClass2();
		object.method();

	}

}
