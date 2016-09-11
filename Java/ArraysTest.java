package com.salmaan.twoseventythree;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void testMissingNo() {
		
		int[] arr = new int[10];
		for(int i=0;i<10;i++)
			arr[i] = i;
		arr[5] = 0;
		Arrays missingno = new Arrays();
		int number = missingno.missingNo(arr, 0, 10);
		assertEquals(number, 5);
		
	}

}
