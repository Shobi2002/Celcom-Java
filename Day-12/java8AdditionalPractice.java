package com.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class java8AdditionalPractice {

	public static void main(String[] args) {
		// 1. Given a list of integers, find out all the even numbers that exist in the
		// list using Stream functions?
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("The Even Numbers :" + evenList);

		// 2. Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> oneList = list.stream().filter(x -> String.valueOf(x).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("The Number Started with one: " + oneList);

		// 3. How to find duplicate elements in a given integers list in java using
		// Stream functions?
		List<Integer> duplicateList = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toList());
		System.out.println("The Duplicate Elements are in List:" + duplicateList);
		// anotherWay
		Set<Integer> duplicateSet = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toSet());
		System.out.println("The Duplicate Elements are in Set:" + duplicateSet);
		// count the duplicate element
		Set<Integer> tempSet = new HashSet();
		long duplicateCount = list.stream().filter(x -> tempSet.add(x) == false).count();
		System.out.println("The duplicate Elements count is " + duplicateCount);

		// 4. Given the list of integers, find the first element of the list using
		// Stream functions?
		int firstElement = list.stream().findFirst().get();
		System.out.println("Find the First Element in the list : " + firstElement);

		// 5. Given a list of integers, find the total number of elements present in the
		// list using Stream
		// functions?
		long listCount = list.stream().count();
		System.out.println("The list Count :" + listCount);

		// 6. Given a list of integers, find the maximum value element present in it
		// using Stream
		// functions?
		int max = list.stream().max((x, y) -> x - y).get();
		System.out.println("The maximum Element in list is :" + max);

		List<Employee> empList = Arrays.asList(new Employee(101, "Shobana", 500), new Employee(102, "Pragathy", 7000),
				new Employee(98, "Hemalatha", 1000));
		//7. Sort the Employee object using salary
		List<Employee> sortedList = empList.stream().sorted((e1, e2) -> e1.salary - e2.salary)
				.collect(Collectors.toList());
		System.out.println("The salary is :" + sortedList);

		// 8. Given a list of integers, sort all the values present in it using Stream
		// functions?
		List<Integer> sortedList1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("The Sorted list : " + sortedList1);

		// 9. Given a list of integers, sort all the values present in it in descending
		// order using Stream
		// functions?
		List<Integer> AscSorted = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
		System.out.println("The ascending Sorted : " + AscSorted);

		// 10. Given an integer array nums, return true if any value appears at least
		// twice in the array,
		// and return false if every element is distinct.
		tempSet.clear();
		boolean flag = list.stream().filter(x -> tempSet.add(x) == false).count() > 0 ? true : false;
		System.out.println(flag);

		// 11.To find factorial of n numbers in java8.
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> factList = list1.stream().map(x -> {
			int fact = 1;
			for (int i = 1; i <= x; i++)
				fact = fact * i;
			return fact;

		}).collect(Collectors.toList());
		System.out.println("The Factorial is :" + factList);

		// 12. Write a Java 8 program to sort an array and then convert the sorted array
		// into Stream?
		int arr[] = { 1, 2, 6, 3, 5 };
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);

		// 13. Convert a List of String into upper case using stream
		List<String> strList = Arrays.asList("Apple", "Orange", "Grape");
		List<String> upperList = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println("The UpperCase is :" + upperList);

		// 14. Convert a List of String into a Map key and it's length as Map Value
		// using Java 8 Stream
		Map<String, Integer> map = strList.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println("The length of Strlist:" + map);

		// 15. flatMap
		List<Integer> even = Arrays.asList(2, 4, 6, 8);
		List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);

		List<List<Integer>> evenOdd = Arrays.asList(even, odd);
		System.out.println("Before Flattering");
		System.out.println(evenOdd);

		List<Integer> result = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattering");
		System.out.println(result);
		
		//16. Java 8 : Consumer
		Consumer <String> consumer = str -> System.out.println(str);
		strList.forEach(consumer);
		
		Consumer <Integer> evenConsumer = n ->{
			if( n % 2 == 0)
				System.out.println(n);
		};
		list.forEach(evenConsumer);
		
		//17. Java 8 : Predicate
		Predicate<String>predicate = str -> str.contains("p");
		strList.stream().filter(predicate).forEach(System.out::println);
		
		Predicate <Integer> evenPredicate = n -> n % 2 == 0;
		list.stream().filter(evenPredicate).forEach(System.out::println);
		
		//18. Java 8 : Function
		Function<String,Character> function = str -> str.charAt(0);
		strList.stream().map(function).forEach(System.out::println);
		
		Function <Integer,String> function1 = n -> {
			if(n % 2 == 0)
				return "Even";	
			else
				return "Odd";
		};
		list.stream().map(function1).forEach(System.out::println);
		
		//19. Supplier
		Supplier <String[]> supplier = ()-> new String[]{"one","two","three"};
		Arrays.asList(supplier.get()).forEach(System.out::println);
		
		Predicate<String> myPredicate = str -> str.contains("o") || str.contains("O");
		Function<String, Character> myFunction = str -> str.charAt(0);
		Consumer<Character> myConsumer = c -> System.out.println(c);

		Arrays.asList(supplier.get()).stream().filter(myPredicate).map(myFunction).forEach(myConsumer);
			

	}
}