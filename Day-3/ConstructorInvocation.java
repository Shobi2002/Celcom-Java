package com.day3;

class Boss {

	Boss() {
		this(5);
		System.out.println("I am Boss");
	}

	Boss(int a) {
		super();
		System.out.println("I am second Boss");
	}

}

	class Superior extends Boss {

		Superior() {
			this(5);
			System.out.println("I am superior");
		}

		Superior(int a) {
			super();
			System.out.println("I am second superiror");
		}


	}

public class ConstructorInvocation {

	public static void main(String[] args) {
		Superior boss = new Superior();
		

	}

}
