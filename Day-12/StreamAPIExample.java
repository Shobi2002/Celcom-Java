package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		List <Integer> numbers = Arrays.asList(12,15,16,23,14,67);
		//filter -->intermediate
		//forEach--> termination
		//System.out :: println  --> refering println to system.in
		System.out.println("Using forEach");
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		
		System.out.println("Using count");
		long count = numbers.stream().filter(x -> x % 2 == 0).count();
		System.out.println(count);
		
		System.out.println("Using collectors");
		Set <Integer> evenNumber = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
		System.out.println(evenNumber);
		
		System.out.println("Multiple of Even Number using Map");
		Set <Integer> multipleOfEven  = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toSet());
		System.out.println(multipleOfEven);
		
		System.out.println("Multiple of Even Number using Map and Sorted");
		Set <Integer> multipleOfEvenSort  = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 10).sorted().collect(Collectors.toSet());
		System.out.println(multipleOfEvenSort);
		
		
		
		
		


	}

}
