package com.day6;

public class Exceptionhandling1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			//int a = 10 / 0;//predefined exception jvm will throw the exception
			int[] arr = new int[-5];
			//int arr[] = { 10, 20, 30 };
			//System.out.println(arr[3]);
			//int b = Integer.parseInt("123");
			//int c = Integer.parseInt("ABc");
		}
		catch (ArithmeticException a) {
			System.out.println("Error is:" + a.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error is:" + e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println("Error is:" + e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error is:" +e.getMessage());
		}
		catch(Error e) {
			System.out.println("Error is:" +e.getMessage());
		}
		catch(Throwable e) {
			System.out.println("Error is:" +e.getMessage());
		}
		finally {
			System.out.println("Inside Finally");
		}
		
		
		try {
			int a = 10 / 0;

		} catch (ArithmeticException a) {
			System.out.println("Error is:" + a.getMessage());
		}
		
		try {

			int arr[] = { 10, 20, 30 };

			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error is:" + e.getMessage());
		}
		
		try {
			int b = Integer.parseInt("123");
			int c = Integer.parseInt("ABc");
		} catch (NumberFormatException e) {
			System.out.println("Error is:" + e.getMessage());
		}

		System.out.println("After Exception");
	}

}
