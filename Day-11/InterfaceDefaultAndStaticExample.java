package com.day11;

interface MyInterfaceone {
	void myAbstarctMethod();

	default void myDefaultMethod() {
		System.out.println("i am Default Method");
	}

	static void myStaticMethod() {
		System.out.println("i am Static Method");
	}
}

public  class InterfaceDefaultAndStaticExample implements MyInterfaceone {
	public void myAbstarctMethod() {
		System.out.println("Abstract method");
		
	}
	public static void main(String[] args) {
		InterfaceDefaultAndStaticExample obj = new  InterfaceDefaultAndStaticExample();
		obj.myDefaultMethod();
		MyInterfaceone.myStaticMethod();
		obj.myAbstarctMethod();
		
		
		
		

	}
	
	
	

}
