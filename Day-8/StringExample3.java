package com.day8;

public class StringExample3 {

	public static void main(String[] args) {
		String s1 = "Shobana";
		//Convert String to Character
		char ch[] = s1.toCharArray();
		
		for(char c : ch) {//for each
			System.out.println(c);
		}
		System.out.println("\n");
		for( int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		String s2 = "Welcome to Java World";
		
		String string[] = s2.split(" ");
		
		for(String s : string) {
			System.out.println(s);
		}
		for(int i=0;i<string.length;i++) {
			if(i % 2 == 0) {
				System.out.println(string);
			}
		}

	}

}
