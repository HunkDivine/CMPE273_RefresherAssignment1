package com.salmaan.twoseventythree;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testEnqueue() {
		
		Queue q1 = new Queue();
		String fname = "John", lname="Doe", pnum="abcd123";
		String t1 = q1.enqueue(fname, lname, pnum);
		assertEquals(fname, t1);
	}

	@Test
	public void testDequeue() {
		Queue q1 = new Queue();
		String fname = "John", lname="Doe", pnum="abcd123";
		q1.enqueue(fname, lname, pnum);
		String t1 = q1.dequeue();
		assertEquals(fname,t1);
	}

}
