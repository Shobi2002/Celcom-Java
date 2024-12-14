package com.day6;

public class GarbageClass {
	static int count = 0; //static variables always have only one copy

	GarbageClass() { // constructor while creating a object it start the performance
		count++;
		System.out.println(count);
	}

	//used to delete a object
	protected void finalize() throws Throwable { // finalize method default by protected may be overriden by public
		count--; // unrefer object is found it decrease the count by 1
		System.out.println(count);
	}

	public static void main(String[] args) {
		GarbageClass obj1 = new GarbageClass();// first object creation then count will became 1
		GarbageClass obj2 = new GarbageClass();// second object creation then count will became 2

		obj1 = null; // make a object as dereference by using null or 
		System.gc(); // manually call the garbage collection 

		obj2 = null;//make a object as dereference by using null
		//Runtime.getRuntime().gc();
		System.gc();  //manually call the garbage collection 

	}

}
