package com.day11;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		number.forEach(numbers -> System.out.println(numbers));

	}

}
