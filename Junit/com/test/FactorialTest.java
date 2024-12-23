package com.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.day13.Factorial;

public class FactorialTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	

	@Test
	public void testGetFactorial() {
		Factorial fact = new Factorial();
		int actual = fact.getFactorial(5);
		int expected = 120;
		assertEquals(expected, actual);

	}

}
