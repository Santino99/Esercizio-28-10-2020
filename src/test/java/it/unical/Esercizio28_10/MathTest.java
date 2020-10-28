package it.unical.Esercizio28_10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
	
	private static Math math;
	
	@BeforeClass
	public static void prepare() {
		math = new Math();
	}
	
	@Test
	public void primeNumbersGeneratorWorks() {
		assertEquals(new LinkedList<>(), math.generaNumeriPrimi(1));
		assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), math.generaNumeriPrimi(20));
	}
	
	@Test
	public void isPrimeWorks() {
		assertFalse(math.isPrime(9));
		assertFalse(math.isPrime(1));
		assertTrue(math.isPrime(2));
		List<Integer> numbers = Arrays.asList(2, 3, 5);
	    for(Integer i : numbers)
	      assertTrue(math.isPrime(i));
	}
	
}
