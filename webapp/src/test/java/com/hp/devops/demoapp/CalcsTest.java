package com.hp.devops.demoapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gullery on 17/02/2016.
 *
 * Testing playground
 *
 * Testing playground
 *
 *
 */
public class CalcsTest {
//yet another comment...
	@Test
	public void sum_test_A() {
		assertEquals(3, Calcs.sum(1,2));
	}

	@Test
	public void sub_test_A() {
		assertEquals(4, Calcs.sub(5, 1));
	}

	@Test
	public void sub_test_B() {
		assertEquals(2, Calcs.sub(-1, -3));
	}

	@Test
	public void sub_test_C() {
		assertEquals(3, Calcs.sub(10, 7));
	}

	@Test
	public void eq_test_A() {
		assertTrue(Calcs.equal(1, 1));
	}

	@Test
	public void eq_test_B() {
		assertTrue(Calcs.equal(-1, -1));
	}

	@Test
	public void neq_test_A() {
		assertTrue(Calcs.nonEqual(0, 1));
	}
//add comment
	@Test
	public void neq_test_B() {
		assertTrue(Calcs.nonEqual(-1, 0));
	}

	@Test
	public void neq_test_C_BrokenTest() {
		assertTrue(Calcs.nonEqual(5, 5));
	}

	@Test
	public void always_true_A() {assertTrue(Calcs.alwaysTrue());}

	@Test
	public void always_false_A() {assertTrue(Calcs.alwaysTrue());}
}
