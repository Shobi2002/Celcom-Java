package com.day5;

interface One {
	int a = 10;//public final static
}

interface Two {
	int b = 20;//public final static
}

interface Three extends One, Two {
	void sum();
}

class NormalClass implements Three {
	public void sum() {
		System.out.println("The Sum is " + (One.a + One.a));
		System.out.println("The Sum is " + (a + b));
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		Three obj = new NormalClass();
		obj.sum();
	}

}
