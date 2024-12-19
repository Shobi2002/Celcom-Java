package com.day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		SortedSet <Object> set = new TreeSet<>(Collections.reverseOrder());
		 
		 set.add(10);
		 set.add(20);
		 set.add(30);
		 set.add(40);
		 set.add(50);
		 set.add(10);
		
		 System.out.println(set);
		 System.out.println(set.isEmpty());
		 System.out.println(set.size());
		 System.out.println(set.contains(6));
		// System.out.println(set.remove(50));
		 //System.out.println(set);
		 
		 //way-1
		 System.out.println("Using for loop");
		 for(Object c : set) {
			 System.out.println(c);
		 }
		 
		 //way-2
		 System.out.println("Using iterator loop");
		 Iterator<Object> it = set.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
