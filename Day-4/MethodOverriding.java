package com.day4;

class Animal {//Super class
	int a=10;
	void action() {
		System.out.println("I do Multiple Action");
	}
    void eat() {
		System.out.println("I am Animal I eat based on my Need");
	}
}

class Cat extends Animal { 
	int a=20;//subclass inherit from superclass
	 void eat() {
		System.out.println("I Eat Lots of Fish");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
	
		Animal cat = new Cat();
		cat.action();
		cat.eat();
		System.out.println(cat.a);
		
	}

}
