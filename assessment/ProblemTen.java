/*Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
*/
 package com.assessment;


import java.util.Scanner;

class Shape {

	void getArea() {
		System.out.println("I am Shape I cannot define any Particular area");
	}
}

class RectangleArea extends Shape {
	Scanner sc = new Scanner(System.in);
	void getArea() {
		System.out.println("Enter the length of Rectangle : ");
		int length = sc.nextInt();
		System.out.println("Enter the breath of Rectangle : ");
		int breath = sc.nextInt();

		int area = length * breath;
		System.out.println("The Area of Rectangle is : " + area);
	}
}

public class ProblemTen {

	public static void main(String[] args) {

		RectangleArea rectangle = new RectangleArea();
		rectangle.getArea();

	}

}
