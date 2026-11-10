package com.in28minutes.calculator;

import java.math.BigDecimal;

public class Calculator {

	public BigDecimal add(BigDecimal left, BigDecimal right) {
		return left.add(right);
	}

	public BigDecimal subtract(BigDecimal left, BigDecimal right) {
		return left.subtract(right);
	}
}
