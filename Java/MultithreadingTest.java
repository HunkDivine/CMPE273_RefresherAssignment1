package com.salmaan.twoseventythree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultithreadingTest {

	@Test
	public void testGetPrime() {
		boolean flag = Multithreading.getPrime(11);
		assertEquals(flag, true);
		boolean flag2 = Multithreading.getPrime(18);
		assertEquals(false, flag2);
	}

}
