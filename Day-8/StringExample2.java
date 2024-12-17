package com.day8;

public class StringExample2 {

	public static void main(String[] args) {
		String s1 = "Celcom";

		System.out.println(s1.length());
		System.out.println(s1.concat(" Solutions"));
		System.out.println(s1.charAt(3));
		System.out.println(s1.equals("Celcom"));
		System.out.println(s1.equalsIgnoreCase("celcom"));
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('c'));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.startsWith("Cel"));
		System.out.println(s1.endsWith("com"));
		System.out.println(s1.replace('C','W'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		//System.out.println(s1.insert(6,"World "));
		System.out.println(s1.compareTo("Celcom"));
		
		
		
		String s2 = "Celcom Solutions Pvt Ltd";
		System.out.println(s2.substring(3,9));
		System.out.println(s2.substring(3));
		
	}

}
