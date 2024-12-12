package com.day4;

class Petone {
	void eat() {
		System.out.println("I cannot eat Specific food");
	}
}

class Dog extends Petone {
	void eat() {
		System.out.println("I eat Bone ");
	}

	void eat(int a) {
		System.out.println("I eat Meat");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.eat(5);

	}

}
