package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter  " + n + " elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println("The Complete Array:" + i);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("The Sorted Array Elements:" + arr[i]);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("The Reverse Sorted Array Elements:" + arr[i]);
		}

	}
}