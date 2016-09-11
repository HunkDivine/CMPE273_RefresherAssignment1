package com.salmaan.twoseventythree;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericsTest {

	@Test
	public void testDisplay() {
		
		Generics g = new Generics();
		Double[] arr1 = {1.55,2.14,23.18,-86.1};
		String[] arr2 = {"John","Jane","Johnny"};
		
		int res1 = g.display(arr1);
		int res2 = g.display(arr2);
		assertEquals(res1, 1);
		assertEquals(res2, 1);
	}

}
