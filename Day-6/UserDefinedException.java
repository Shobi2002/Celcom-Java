package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
//@SuppressWarnings("serial")
class AgeException extends Exception {
	public String toString() {
		return "Invalid age for voting";
	}
}


public class UserDefinedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Welcome to Vote");
		} else {
			try {

				throw new AgeException();// checked exception
			} catch (AgeException e ) {
				System.out.println(e);
			}
		}
	}

}
