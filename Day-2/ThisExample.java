package com.day2;

class MobileOne {
	int mobid;
	String brand;
	float price;

	MobileOne(int mobid, String brand, float price) {
		this.mobid = mobid;// this keyword calling variables
		this.brand = brand;
		this.price = price;

		this.display();// this keyword calling Method
	}

	MobileOne() {
		this(101, "Vijayan", 100000);// this keyword calling constructor
		// this(102,"Devi",150000);
	}

	void display() {
		System.out.println("The Mobile Id is:" + mobid);
		System.out.println("The Mobile brand is:" + brand);
		System.out.println("The Mobile price is:" + price);
		System.out.println("--------------");

	}
}

public class ThisExample {

	public static void main(String[] args) {
		MobileOne mob = new MobileOne();
		MobileOne oppo = new MobileOne(102, "oneplus", 300000);

	}

}
