package com.day2;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int duplicateCount = 0;

		System.out.println("Enter the Array Elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = i+1; j < arr.length && arr[i] != '@'; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '@';
				}
			}
			
			if (count > 0) 
				duplicateCount++;	
		}
		
		System.out.println("Total no.of duplicate Elements : " + duplicateCount);
		sc.close();
	}

}
