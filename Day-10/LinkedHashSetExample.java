package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set <Integer> set = new LinkedHashSet<>();
		 
		 set.add(10);
		 set.add(20);
		 set.add(30);
		 set.add(40);
		 set.add(50);
		 set.add(10);
		 set.add(null);
		 set.add(null);
		 
		 System.out.println(set);
		 System.out.println(set.isEmpty());
		 System.out.println(set.size());
		 System.out.println(set.contains(6));
		// System.out.println(set.remove(50));
		 //System.out.println(set);
		 
		 //way-1
		 System.out.println("Using for loop");
		 for(Integer c : set) {
			 System.out.println(c);
		 }
		 
		 //way-2
		 System.out.println("Using iterator loop");
		 Iterator<Integer> it = set.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
