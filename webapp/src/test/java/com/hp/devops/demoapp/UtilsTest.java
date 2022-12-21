package com.hp.devops.demoapp;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 25/11/14
 * Time: 13:46
 * To change this template use File | Settings | File Templates.
 */
public class UtilsTest {

	@Test
	public void nodifyTestA() {
		String[] result = Utils.nodify(null);
		assertEquals(result.length, 0);         //  0 is the right answer
	}

	@Test
	public void nodifyTestB() {
		String[] result = Utils.nodify("");
		assertEquals(result.length, 0);         //  0 is the right answer
	}

	@Test
	public void nodifyTestC() {
		String[] result = Utils.nodify("/api");
		assertEquals(result.length, 0);
	}

	@Test
	public void nodifyTestD() {
		String[] result = Utils.nodify("/some");
		assertEquals(result.length, 1);
		assertEquals(result[0], "some");
		assertEquals(true, true);
	}

	@Test
	public void nodifyTestE() {
		String[] result = Utils.nodify("/api/some");
		assertEquals(result.length, 1);
		assertEquals(result[0], "some");
	}

	@Test
	public void nodifyTestF() {
		String[] result = Utils.nodify("/api/some/more");
		assertEquals(result.length, 2);
		assertEquals(result[0], "some");
		assertEquals(result[1], "more");
	}

	@Test
	public void nodifyTestG() {
		String[] result = Utils.nodify("//api///some/");
		assertEquals(result.length, 1);
		assertEquals(result[0], "some");
	}

	@Test
	public void failTestForCoverageAnalysisA() {
		String[] result = Utils.nodify("/api/some/more");
		assertEquals(true, false);
	}

	@Test
	public void testSimpleLogical() {
		boolean result = Utils.simpleLogical();
		assertTrue(result);
	}
}
