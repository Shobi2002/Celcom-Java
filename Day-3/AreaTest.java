package com.day3;

class Shapes {
	int length;
	int breath;
	int side;
	int height;

	public Shapes(int length, int breath) {
		
		this.length = length;
		this.breath = breath;
	}

	public Shapes(int side) {

		this.side = side;
	}

	public Shapes(int length, int breath, int height) {

		this.length = length;
		this.breath = breath;
		this.height = height;
	}

	void area() {
		System.out.println("Cannot define a Area for Shape");
	}

}

class Rectangle extends Shapes {

	public Rectangle(int length, int breath) {
		super(length, breath);

	}

	void area() {
		int area = length * breath;
		System.out.println("The Area of Rectangle is :" + area);
	}

}

class Square extends Shapes {

	public Square(int side) 
	{
		
		super(side);

	}

	void area() {
		int area = side * side;
		System.out.println("The Area of Square is :" + area);
	}

}

class Triangle extends Shapes {

	public Triangle(int length, int breath, int height) {
		super(length, breath, height);

	}

	void area() {
		float area = (length * breath * height) / 2;
		System.out.println("The Area of Triangle is :" + area);
	}

}

public class AreaTest {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(10, 15);
		rectangle.area();

		Square square = new Square(30);
		square.area();

		Triangle triangle = new Triangle(30, 60, 40);
		triangle.area();

	}

}
