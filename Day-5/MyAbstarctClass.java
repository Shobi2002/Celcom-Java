package com.day5;

abstract class MyClass {
	abstract void MyAbstractMethod();

	abstract void MyAbstractMethod1();

	void MyConcrete() {
		System.out.println("My Concrete Method");
	}
}

class Subclass extends MyClass {
	protected void MyAbstractMethod() {
		System.out.println("It is inherit abstract class-1");
	}

	protected void MyAbstractMethod1() {
		System.out.println("It is inherit abstract class-2");
	}

}

public class MyAbstarctClass {

	public static void main(String[] args) {
		MyClass object = new Subclass();//DMD its creating reference for multiple class 
		//its is a object refernce for abstarct class 
		object.MyConcrete();
		object.MyAbstractMethod();
		object.MyAbstractMethod1();

	}

}
