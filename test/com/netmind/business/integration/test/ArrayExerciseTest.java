package com.netmind.business.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.netmind.array.ArrayExercise;

public class ArrayExerciseTest {

	@Test
	public void testAddEvenNumbers() {
		int[] intArray = new int[100];
		ArrayExercise arrayExercise = new ArrayExercise();

		for (int i = 0; i < 100; i++) {
			intArray[i] = i + 1;
		}

		assertEquals(arrayExercise.addEvenNumber(intArray), 2500);
	}
}
