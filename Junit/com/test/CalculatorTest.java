package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.day13.Calculator;

public class CalculatorTest {
	int input1 ;
	int input2 ;
	static Calculator calc;
	
	@BeforeClass
	public  static void beforeClass() {
		System.out.println("Before Class");
		calc = new Calculator();
	}
	
	@AfterClass
	public  static void afterClass() {
		System.out.println("After Class");
		calc = null;
	}
	
	@Before 
	public void before() {//before normal execution for each test cases
		System.out.println("Before");
		int input1 = 10;
		int input2 = 20;
	}
	
	@After
	public void after() {//after normal execution for each test cases
		System.out.println("After");
		int input1 = 0;
		int input2 = 0;
	}

	@Test
	public void testAddition() {
		System.out.println("Test Addition");
		Calculator calc = new Calculator();
		int actual = calc.addition(input1, input2);
		int expected = input1 + input2;
		assertEquals(expected, actual);
		

	}

	@Test
	public void testSubtraction() {
		System.out.println("Test Subtraction");
		Calculator calc = new Calculator();
		int actual = calc.subtraction(input1, input2);
		int expected = input1 - input2;
		assertEquals(expected, actual);

	}

}
