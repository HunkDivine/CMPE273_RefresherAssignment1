package com.salmaan.twoseventythree;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterfaceTest {

	@Test
	public void testEat() {
		InterfaceEagle e = new InterfaceEagle();
		int r1 = e.eat();
		assertEquals(r1, 1);
		InterfaceGoat g = new InterfaceGoat();
		int r2 = g.eat();
		assertEquals(r2,1);
	}

	@Test
	public void testMove() {
		InterfaceEagle e = new InterfaceEagle();
		int r1 = e.move();
		assertEquals(r1, 1);
		InterfaceGoat g = new InterfaceGoat();
		int r2 = g.move();
		assertEquals(r2,1);
	}

	@Test
	public void testFly() {
		InterfaceEagle e = new InterfaceEagle();
		int r1 = e.fly();
		assertEquals(r1, 1);
		InterfaceGoat g = new InterfaceGoat();
		int r2 = g.fly();
		assertEquals(r2,0);
	}

	@Test
	public void testSwim() {
		InterfaceEagle e = new InterfaceEagle();
		int r1 = e.swim();
		assertEquals(r1, 1);
		InterfaceGoat g = new InterfaceGoat();
		int r2 = g.swim();
		assertEquals(r2,1);
	}

}
