package com.day6;

public class ObjectCloning implements Cloneable {
	int a = 10;

	public static void main(String[] args) throws CloneNotSupportedException {
		int a = 50;
		ObjectCloning obj1 = new ObjectCloning();

		ObjectCloning obj2 = (ObjectCloning) obj1.clone();

		obj1.a = 20;

		System.out.println(a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
