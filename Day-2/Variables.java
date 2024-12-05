package com.day2;

public class Variables {
	int a = 10;
	static int c = 20;

	public static void main(String[] args) {
		int b = 30;
		System.out.println("The value of Local variable:"+b);

		Variables var = new Variables();
		System.out.println("The value of instance Variable:"+var.a);

		System.out.println("The value of Static Variable:"+Variables.c);

	}

}
