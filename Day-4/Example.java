package com.day4;

class Fruit {
	String str ="A for Apple";
	void taste() {
		System.out.println("I have many taste ");
	}
	void color() {
		System.out.println("I doesn't have any specific color");
	}
}

class Apple extends Fruit {
	String str ="B for Apple";
	void color() {
		System.out.println("I have red color");
	}
}

public class Example {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.color();
		apple.taste();
		System.out.println(apple.str);

	}

}
