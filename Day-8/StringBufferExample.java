package com.day8;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new  StringBuffer("elole");
		if(sb.toString().equals(sb.reverse().toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" Not a Palindrome");
		}
		
		String s1 = "madam";
		String s2 = new StringBuffer(s1).reverse().toString();
		
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" Not a Palindrome");
		}
	}

}
