package com.salmaan.twoseventythree;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionsTest {

	@Test
	public void testAdd() {
		Collections map = new Collections();
		map.add(1234, "Salmaan");
		assertEquals("Salmaan", map.display(1234));
	}

	@Test
	public void testRemove() {
		Collections map = new Collections();
		map.add(1234, "Salmaan");
		map.remove(1234);
		assertEquals(null,map.display(1234));
	}

	@Test
	public void testDisplay() {
		Collections map = new Collections();
		map.add(1234, "Salmaan");
		assertEquals("Salmaan",map.display(1234));
	}

}
