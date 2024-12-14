package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

class MyClass{
	//Checked Exception or throws keyword
	void myMethod() throws FileNotFoundException{
		FileReader fr = new FileReader("Shobana.txt");

	}
	
	void myMethod1() {
		try {
			myMethod();
		}
		catch(FileNotFoundException e) {
			myMethod1();
		}
	}

}
public class ExceptionTypes {

	public static void main(String[] args)  {
		
		//Unchecked  Exception
		//int a = 10 / 0;
		MyClass myclass = new MyClass();
		myclass.myMethod1();
		
		
		
}
}
