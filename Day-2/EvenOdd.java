package com.day2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countEven = 0;
		int countOdd = 0;
		int arr[] = new int[5];
		System.out.println("Enter the Array Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		System.out.println("Even Elements Count:" + countEven);
		System.out.println("Odd Elements Count:" + countOdd);

	}

}
