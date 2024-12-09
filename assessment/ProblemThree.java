/*Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
*/
package com.assessment;

import java.util.Scanner;

class Rectangle {
	 int width;
	 int height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		area();
		perimeter();
	}

	void area() {
		int area = height * width;
		System.out.println("The Area of Rectangle is : " + area);
	}

	void perimeter() {
		int perimeter = 2 * (height * width);
		System.out.println("The Perimeter of Rectangle is : " + perimeter);

	}

}

public class ProblemThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rectangle Width : ");
		int a = sc.nextInt();
		System.out.println("Enter the Rectangle height : ");
		int b = sc.nextInt();
		Rectangle rectangle = new Rectangle(a, b);

	}

}
