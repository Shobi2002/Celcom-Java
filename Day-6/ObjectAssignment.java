package com.day6;

//object Assignment
public class ObjectAssignment {
	int a = 10;// instance value

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectAssignment obj1 = new ObjectAssignment();// first object creation
		ObjectAssignment obj2 = obj1;// first object is assigned to second one
		ObjectAssignment obj3 = new ObjectAssignment();// third object creation

		obj1.a = 50;// change the value of variable

		System.out.println(obj2.a); // changed value is affected in this object
		System.out.println(obj3.a); // but its not affected in this will print the instance value only
		// obj1 = null;
		// obj2 = null;
		// obj3 = null;
		System.out.println(obj1.hashCode());// hashcode it use to give some unique value to every object
		System.out.println(obj2.hashCode());// both obj1 and obj 2 are same because we assiging the obj1 to obj2
		System.out.println(obj3.hashCode());// here the hashcode is different

	}

}
