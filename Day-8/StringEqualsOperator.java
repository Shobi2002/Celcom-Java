package com.day8;

public class StringEqualsOperator {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(System.identityHashCode(a));
		int b = 10;
		System.out.println(System.identityHashCode(b));
		
		String s1 = new String("Shobana");
		System.out.println(s1.hashCode());
		String s2 = new String("Shobana");
		System.out.println(s2.hashCode());

		System.out.println("This compare the string by using == operator : " + (s1 == s2));// By using == operator
		System.out.println("This compare the string by using equals method  : " + s1.equals(s2));// By using equals
																									// method
		String s3 = "SHOBANA";
		String s4 = "SHOBANA";
		
		System.out.println(s3 == s4);//true
		System.out.println(s3.toLowerCase() == s4.toLowerCase());
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
		System.out.println(s1 == s3);//false
		System.out.println(s1.equals(s3));//true
	}

}
