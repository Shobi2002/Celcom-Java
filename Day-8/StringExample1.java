package com.day8;

public class StringExample1 {

	public static void main(String[] args) {
		String s1 = "Shobana";//first way declaration

		String s2 = new String("Java");//second way declaration

		char ch[] = { 'H', 'E', 'L', 'L', 'O' };
		String s3 = new String(ch);//third way declaration by using character

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
