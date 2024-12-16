package com.day7;


interface Inner4{
	void display();
}

interface Inner5{
	void display1();
}
public class InnerClassExample1 {
	// non-static inner class
	class Inner1 {
		void display() {
			System.out.println("Non-Static Inner Class");
		}
	}

	// static inner class
	static class Inner2 {
		void display() {
			System.out.println("Static Inner Class");
		}

		// static method
		static void display1() {
			System.out.println("static method in inner class");
		}
	}

	public static void main(String[] args) {
		InnerClassExample1 obj = new InnerClassExample1();
		Inner1 inner = obj.new Inner1();
		inner.display();

		Inner2 inner2 = new InnerClassExample1.Inner2();
		inner2.display();
		Inner2.display1();

		class Inner3 {
			void display() {
				System.out.println("Local Inner Class");
			}
		}

		Inner3 obj1 = new Inner3();
		obj1.display();

		
		Inner4 obj2 = new Inner4() {
			public void display() {
				System.out.println("Anonymous Inner Class");
			}
		};
		obj2.display();
	}
		

}
