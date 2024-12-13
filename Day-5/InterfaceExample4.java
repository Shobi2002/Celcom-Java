package com.day5;
interface VehiclePlan{
	void noOfEngine();
	void noOfWheels();
	void brandName();
}
abstract class Vehicles1 implements VehiclePlan{
	public void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class Auto extends Vehicles1{
	public void noOfWheels() {
		System.out.println("I have 3 Wheels");
	}
	public void brandName() {
		System.out.println("Its a Bajaj");
	}

	
	
}
public class InterfaceExample4 {

	public static void main(String[] args) {
		VehiclePlan auto = new Auto();
		auto.noOfEngine();
		auto.noOfWheels();
		auto.brandName();
		
	}

}
