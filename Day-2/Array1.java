package com.day2;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Initial Array Elements:");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter " + arr.length + " Elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("New Array Elements:");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}

		System.out.println("Sum of all Your Array Elements : " + sum);
	}

}
