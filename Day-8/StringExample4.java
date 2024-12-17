package com.day8;

public class StringExample4 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		s1.concat(" World");
		System.out.println(s1);
		
		String s2 = new String("Java");
		s2 = s2.concat(" World");
		System.out.println(s2);
		
		StringBuffer sb = new  StringBuffer("Ellora");
		sb.append(" Ajenda");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		
	}

}
