package com.day5;

abstract class Shapes {
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

	abstract void area();

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

	public Square(int side) {

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

public class AreaTestusingAbstarct {

	public static void main(String[] args) {

		Shapes shape;
		shape = new Rectangle(5, 4);
		shape.area();
		shape = new Square(5);
		shape.area();
		shape = new Triangle(2, 3, 4);
		shape.area();

	}

}
