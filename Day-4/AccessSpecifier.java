package com.day4;

class Computer {
	void systemFunctionalities() {
		System.out.println("System have id");
	}
}

class Laptop extends Computer {
	KeyBoard keyboard = null;

	Laptop(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}

	void monitorFunctionalities() {
		System.out.println("Laptop have port number ");
	}

	void monitorKeyboardFunctionalities() {
		keyboard.keyboardFunctionalities();
	}
}

class KeyBoard {
	void keyboardFunctionalities() {
		System.out.println("I have many keys");
	}
}

public class AccessSpecifier {

	public static void main(String[] args) {
		KeyBoard keyboard = new KeyBoard();

		Laptop laptop = new Laptop(keyboard);
		laptop.systemFunctionalities();
		laptop.monitorFunctionalities();
		laptop.monitorKeyboardFunctionalities();

	}

}
