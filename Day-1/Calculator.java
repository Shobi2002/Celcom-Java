package com.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "";
		do {
			System.out.println("Enter a First Number:");
			int a = sc.nextInt();

			System.out.println("Enter a Second Number:");
			int b = sc.nextInt();

			System.out.println("Menu for operation");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Exit");
			System.out.println("Enter your Choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Addition of this Number:" + (a + b));
				break;
			case 2:

				System.out.println("Subtraction of this Number:" + (a - b));
				break;
			case 3:

				System.out.println("Multiplication of this Number:" + (a * b));
				break;
			case 4:

				System.out.println("Division of this Number:" + (a / b));
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Do you want to continue[yes/no]:");
			message = sc.next();

		} while (message.equalsIgnoreCase("yes"));
		sc.close();
	}
}
