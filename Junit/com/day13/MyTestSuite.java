package com.day13;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.CalculatorTest;
import com.test.CalculatorTest1;
import com.test.FactorialTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	CalculatorTest.class, 
	CalculatorTest1.class, 
	FactorialTest.class

})
public class MyTestSuite {

}
