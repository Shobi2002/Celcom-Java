package com.day6;

public class ThrowExceptionManually {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;//jvm throw the error to catch block
			//manually throw the exception 
			throw new ArithmeticException("This is divided by zero Exception");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
