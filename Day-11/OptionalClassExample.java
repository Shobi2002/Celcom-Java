package com.day11;

import java.util.Optional;
import java.util.Scanner;

public class OptionalClassExample {

	public static void main(String[] args) {
		String name = null;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter The name:");
//		String name = sc.next();

		Optional<String> nameOptional = Optional.ofNullable(name);
		if (nameOptional.isPresent()) {
			String value = nameOptional.get();
			System.out.println("Hi " + value);
		} else {
			System.out.println("Sorry the value is null");
		}

	}

}
