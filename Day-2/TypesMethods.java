package com.day2;

public class TypesMethods {
	void instanceMethod() {
		System.out.println("This is Instance Method");
	}

	static void staticMethod() {
		System.out.println("This is Static Method");
	}

	public static void main(String[] args) {
		TypesMethods type = new TypesMethods();
		type.instanceMethod();
		
		TypesMethods.staticMethod();

	}

}
