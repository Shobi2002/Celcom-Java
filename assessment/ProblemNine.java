
/* Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".
*/
 package com.assessment;
 

class Vehicle {
	void drive() {
		System.out.println("I am Vehicle");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Repairing a Car");
	}
}

public class ProblemNine {

	public static void main(String[] args) {
		Car car = new Car();
		car.drive();

	}

}
