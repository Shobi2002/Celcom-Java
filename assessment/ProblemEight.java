/*Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
*/
package com.assessment;

class Animal{
	void makeSound() {
		System.out.println("Every Animal have unique Sound");
	}
}

class Cat extends Animal{
	void makeSound() {
		//super.makeSound();
		System.out.println("The Cat Sound is Bark");
	}
}
public class ProblemEight {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();

	}

}
