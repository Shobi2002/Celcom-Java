package com.day2;

public class InstanceAndStatic {
	int a = 10;
	static int b = 40;

	public static void main(String[] args) {
		InstanceAndStatic obj1 = new InstanceAndStatic();
		InstanceAndStatic obj2 = new InstanceAndStatic();
		// before changing value of instance variable
		System.out.println("Before Changing Value of InstanceVariable(obj1):"+obj1.a);
		System.out.println("Before Changing Value of InstanceVariable(onj2):" +obj2.a);
		//static variable value of static variable
		System.out.println("Before Changing Value of staticVariable(obj1):"+obj1.b);
		System.out.println("Before Changing Value of staticVariable:(obj2)"+obj2.b);
		obj1.a = 30;//changing a value of instance variable
		obj1.b = 30;//changing a value of static variable
		
		//after changing value of instance variable
		System.out.println("After Changing Value of InstanceVariable(obj1):"+obj1.a);
		System.out.println("After Changing Value of InstanceVariable(obj2):"+obj2.a);
		//after changing value of static variable
		System.out.println("After Changing Value of StaticVariable(obj1):"+obj1.b);
		System.out.println("After Changing Value of StaticVariable(obj2):"+obj2.b);

	}

}
