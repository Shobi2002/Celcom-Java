package com.day9;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Integer> vec = new Vector<>(3, 2);
		System.out.println("Initially "+vec.size());
		System.out.println("Initial Capacity " +vec.capacity());
		
		vec.add(20);
		System.out.println("The First Element is added then size " +vec.size());
		System.out.println("The First Element is added then capacity " +vec.capacity());
		vec.add(30);
		System.out.println("The Second Element is added then size " +vec.size());
		System.out.println("The Second Element is added  then capacity" +vec.capacity());
		vec.add(50);
		System.out.println("The Third Element is added then size "+vec.size());
		System.out.println("The Third Element is Added then capacity" +vec.capacity());
		vec.add(70);
		System.out.println("The fourth Element is added then size " +vec.size());
		System.out.println("The Fourth Element is added then capacity" +vec.capacity());
		vec.add(40);
		System.out.println("The fifth Element is added then size : "+vec.size());
		System.out.println("The Fifth Element is added then capacity" +vec.capacity());
		vec.add(50);
		System.out.println("The sixth Element is added then size : "+vec.size());
		System.out.println("The sixth Element is added then capacity" +vec.capacity());

	}

}
