package com.day4;

public class ConstructorOverloading {

	ConstructorOverloading(int n) {
		this(5,10);//used to call instance class constructor or parameterized constructor calling
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of Number is :" + fact);
	}

	ConstructorOverloading(int a, int b) {
		this("Shobana Vijayan");
		int c = a + b;
		System.out.println("The addition of this two number is : " + c);
	}

	ConstructorOverloading(String s) {
		System.out.println("Welcome " + s);
	}

	public static void main(String[] args) {

		ConstructorOverloading objone = new ConstructorOverloading(5);
		//ConstructorOverloading objtwo = new ConstructorOverloading(13, 24);
		//ConstructorOverloading objthree = new ConstructorOverloading("shobana Vijayan");

	}

}
