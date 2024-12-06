package com.day3;

class Vehicle {
	void noOfEngine() {
		System.out.println(" I am a Vehicle I have one Engine");
	}
}

class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("I have two Wheels");
	}
}

class Bike extends TwoWheeler {
	void brandName() {
		System.out.println("Brand Name is : Honda");
	}
}
class FourWheeler extends Vehicle {
	void fourWheel() {
		System.out.println("I have Four Wheels");
	}
}

class Car extends FourWheeler {
	void brandName() {
		System.out.println("Brand Name is : hundai");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		Bike honda = new Bike();
		Car car = new Car();
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandName();
		car.fourWheel();
		car.brandName();
		

	}

}
