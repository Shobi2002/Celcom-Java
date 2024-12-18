package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		List<Object> list1 = new LinkedList<>();

		// collection interface

		list.add(10);// Integer wrapper class from old 1.5 version we used now deprecated
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		System.out.println(list);

		list1.add("shobana");
		list1.add(10);
		list1.add("java");
		System.out.println(list1);

		// list interface
		list.add(1, 25);
		System.out.println(list);
		System.out.println(list.get(0));

		list.remove(0);
		System.out.println(list);

		list.set(3, 50);
		System.out.println(list);

		System.out.println(list.contains(25));// return boolean

		System.out.println(list.size());// return the size

		System.out.println(list.isEmpty());

		// list.clear();
		System.out.println(list);

		System.out.println(list.isEmpty());

		// way to traverse the list
		// way-1
		System.out.println("using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Way-2
		System.out.println("using for each loop");
		for(int i : list) {
			System.out.println(i);
		}
		for(Object i : list1) {
			System.out.println(i);
		}

		//Way-3
		System.out.println("using for iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("using odd or even");
		Iterator<Integer> it1 = list.iterator();
		while(it1.hasNext()) {
			Integer t = it1.next();
			if(t % 2 == 1) {
				it1.remove();		
			}
			
		}
		System.out.println(list);
		

	}

}
