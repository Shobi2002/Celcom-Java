package com.day11;

@FunctionalInterface
interface MyReference {
	void showMessage();
}

public class MethodReferenceExample {
	void myInstanceMethod() {
		System.out.println("Example for Instance Method Reference");
	}

	static void myStaticMethod() {
		System.out.println("Example for Static Refernce");
	}

	public MethodReferenceExample() {
		System.out.println("Example for Constructor");
	}

	public static void main(String[] args) {
		// Reference to a Instance Method
		MethodReferenceExample obj = new MethodReferenceExample();
		MyReference reference = obj::myInstanceMethod;
		reference.showMessage();

		// Reference to a Static Method
		reference = MethodReferenceExample::myStaticMethod;
		reference.showMessage();

		// Reference to a constructor
		reference = MethodReferenceExample::new;
		reference.showMessage();

	}
}
