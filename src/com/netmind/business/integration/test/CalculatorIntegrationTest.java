package com.netmind.business.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.netmind.business.Calculator;

public class CalculatorIntegrationTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(4, 2),6);
	}

	@Test
	public void testSubstract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
