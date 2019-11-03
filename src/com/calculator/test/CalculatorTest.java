package com.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cum.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(40, calculator.sum(10, 20));
	}

}
