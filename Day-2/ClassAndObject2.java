package com.day2;

import java.util.Scanner;

class Mobile {
	int mobid;
	String brand;
	float price;

	Mobile(int mobid, String brand, float price) {
		this.mobid = mobid;
		this.brand = brand;
		this.price = price;
	}

	void display() {
		System.out.println("The Mobile Id is:" + mobid);
		System.out.println("The Mobile brand is:" + brand);
		System.out.println("The Mobile price is:" + price);
		System.out.println("--------------");
		
		
	}
}

public class ClassAndObject2 {

	public static void main(String[] args) {
		
		Mobile samsung = new Mobile(101, "Samsung", 70000);
		samsung.display();

		Mobile vivo = new Mobile(102, "Vivo", 90000);
		vivo.display();

	}

}
