package com.salmaan.twoseventythree;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testPopStack() {
		Stack s1 = new Stack();
		String e1 = "www.google.com";
		String a1 = s1.pushStack(e1);
		e1 = s1.popStack();
		assertEquals(e1,a1);
		
	}

	@Test
	public void testPushStack() {
		Stack s1 = new Stack();
		String e1 = "www.google.com";
		String a1 = s1.pushStack(e1);
		assertEquals(e1,a1);
	}

}
