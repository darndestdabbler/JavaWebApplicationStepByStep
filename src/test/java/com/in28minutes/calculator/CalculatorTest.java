package com.in28minutes.calculator;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void add() {
		assertEquals(new BigDecimal("6.5"), calculator.add(new BigDecimal("2.5"), new BigDecimal("4")));
	}

	@Test
	public void subtract() {
		assertEquals(new BigDecimal("-1.5"), calculator.subtract(new BigDecimal("2.5"), new BigDecimal("4")));
	}
}
