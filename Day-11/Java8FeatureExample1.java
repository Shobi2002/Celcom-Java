package com.day11;

@FunctionalInterface
interface MyInterface {
	int calc(int a, int b);// by default its public and abstract
}
/*
 * //without lambda Expression class Addition implements MyInterface { public
 * int calc(int a, int b) { return a + b; } }
 * 
 * class Subtraction implements MyInterface { public int calc(int a, int b) {
 * return a - b; } }
 */

public class Java8FeatureExample1 {

	public static void main(String[] args) {
		MyInterface ref = (a, b) -> a + b;
		System.out.println("The Sum is:"+ref.calc(20, 30));

		ref = (a, b) -> a - b;
		System.out.println("The minus is :"+ref.calc(40, 30));

		ref = (a, b) -> a * b;
		System.out.println(ref.calc(40, 30));

		ref = (a, b) -> a / b;
		System.out.println(ref.calc(40, 30));

	}

}
