package com.day5;
//abstract class with constructor
abstract class Vehicleone {
	Vehicleone(){
		System.out.println("Abstract class constructor");
	}
	Vehicleone(int a){
		System.out.println("Abstract class constructor with parameter");
	}
	void noOfEngine() {// its a concrete method or normal method
		System.out.println("I have one Engine");
	}

	abstract void noOfWheels();// its a abstract method we can only declare but not define here

	abstract void brandName();
}

class Bikeone extends Vehicleone {
	Bikeone(){
		super(5);
	}
	void noOfWheels() {// the abstract method definition
		System.out.println("I have two Wheels");
	}

	void brandName() {
		System.out.println("It is a Hero Motor corp");
	}
}

public class AbstractClassExample3 {

	public static void main(String[] args) {

		Vehicleone vehicle;// creating a reference for all class
		vehicle = new Bikeone();// its a object for bike class
		System.out.println("I am Bike");
		vehicle.noOfWheels();
		vehicle.brandName();
		vehicle.noOfEngine();

	}

}
