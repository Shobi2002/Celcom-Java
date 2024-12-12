package com.day4;

public class MethodOverloading {
	void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of Number is :" + fact);
	}

	void add(int a, int b) {
		int c = a + b;
		System.out.println("The addition of this two number is : " + c);
	}

	void hello(String s) {
		System.out.println("Welcome " + s);
	}

	public static void main(String[] args) {
		MethodOverloading method = new MethodOverloading();
		method.factorial(5);
		method.add(12, 13);
		method.hello("shobana");
	}

}
