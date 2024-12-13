package com.day5;

abstract class Vehicle {
	void noOfEngine() {//its a concrete method or normal method
		System.out.println("I have one Engine");
	}

	abstract void noOfWheels();// its a abstract method we can only declare but not define here

	abstract void brandName();
}

class Bike extends Vehicle {
	void noOfWheels() {// the abstract method definition
		System.out.println("I have two Wheels");
	}

	void brandName() {
		System.out.println("It is a Hero Motor corp");
	}
}

class Car extends Vehicle {
	void noOfWheels() {
		System.out.println("I have Four Wheels");
	}

	void brandName() {
		int j=0;
		System.out.println("It is a Maruthi suzuki "+ ++j);
	}
}

public class RealTime {

	public static void main(String[] args) {
		Vehicle vehicle;//creating a reference for all class
		vehicle = new Bike();// its a object for bike class
		System.out.println("I am Bike");
		vehicle.noOfWheels();
		vehicle.brandName();
		vehicle.noOfEngine();
		
		System.out.println("I am Car");
		vehicle = new Car();//its a object for car class
		vehicle.noOfWheels();
		vehicle.brandName();
		vehicle.noOfEngine();

	}

}
