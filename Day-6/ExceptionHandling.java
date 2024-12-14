package com.day6;

public class ExceptionHandling {
	int a = 10;
	int b = Integer.parseInt("ABC");

	public static void main(String[] args) {
		System.out.println("Before Exception");
		 int a = 10 / 0;
		 int arr[]= {10,20,30};
		 System.out.println(arr[3]);
		 int arr1[]=new int[-5];
		 
		ExceptionHandling obj = null;
		System.out.println(obj.b);
		System.out.println("After Exception");
	}

}
