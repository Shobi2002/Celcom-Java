package com.day11;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",");
		
		joiner.add("One");
		joiner.add("Two");
		joiner.add("Three");
		
		String result = joiner.toString();
		StringJoiner joiner1 = new StringJoiner(",","[","]");
		
		joiner1.add("Red");
		joiner1.add("Green");
		joiner1.add("Blue");
		
		String result1 = joiner1.toString();
		
		System.out.println(result);
		System.out.println(result1);

	}

}
