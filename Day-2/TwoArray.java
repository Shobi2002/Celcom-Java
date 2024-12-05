package com.day2;

import java.util.Scanner;

public class TwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array:");
		int n = sc.nextInt();
		System.out.println("Enter Size of Array of Array:");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		System.out.println("Enter the Elements of Array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i[] : arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
