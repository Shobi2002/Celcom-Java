package com.day9;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack <Integer> stack = new Stack<>();
		
		stack.push(10);//it is used to put a element in a stack
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		
		stack.pop();// its used to remove the element
		System.out.println(stack);
		
		System.out.println(stack.peek());//its use to show first element in the stack
		
	}

}
