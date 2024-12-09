/*Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
*/
 package com.assessment;


class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	void area() {
		double area;
		double pi = 3.14;

		area = 2 * pi * radius * radius;

		System.out.println("The Area of Circle is : " + area);

	}

	void perimeter() {
		double perimeter;
		double pi = 3.14;

		perimeter = 2 * pi * radius;

		System.out.println("The Area of Circle is : " + perimeter);

	}
}

public class problemFour {

	public static void main(String[] args) {

		Circle circle = new Circle(4);
		circle.area();
		circle.perimeter();
		circle.setRadius(15);
		System.out.println("After Changing a value of Radius");
		circle.area();
		circle.perimeter();

	}

}
