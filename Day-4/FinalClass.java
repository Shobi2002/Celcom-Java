package com.day4;

final class Dogone { // final class cannot inherit
	final int a = 10;// final variable cannot changed

	final void name() { // final method cannot override
		System.out.println(a);
		System.out.println("I am Dog");
	}
}

public class FinalClass {

	public static void main(String[] args) {
		Dogone dog = new Dogone();
		dog.name();
	}

}
