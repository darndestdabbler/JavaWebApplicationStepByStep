package com.in28minutes.calculator;

import java.math.BigDecimal;

/**
 * The arithmetic behind the calculator page: the sum and the difference of
 * two numbers.
 */
public class Calculator {

	/**
	 * Adds two numbers.
	 *
	 * @param left the first number
	 * @param right the number added to it
	 * @return the sum of {@code left} and {@code right}
	 */
	public BigDecimal add(BigDecimal left, BigDecimal right) {
		return left.add(right);
	}

	/**
	 * Subtracts one number from another.
	 *
	 * @param left the number subtracted from
	 * @param right the number subtracted
	 * @return {@code left} minus {@code right}
	 */
	public BigDecimal subtract(BigDecimal left, BigDecimal right) {
		return left.subtract(right);
	}
}
