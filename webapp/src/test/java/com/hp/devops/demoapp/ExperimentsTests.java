package com.hp.devops.demoapp;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

/**
 * Created with IntelliJ IDEA.
 * User:  gullery
 * Date: 25/11/15
 * Time: 14:48
 * To change this template use File  | Settings | File Templates.
 */
public class ExperimentsTests {

	@Test
	public void dataManagerTestA12() {
		Assert.assertEquals(true, true);
	}

	@Test
	public void dataManagerTestB12() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void failTestForCoverageAnalysisB12() {
		Assert.assertEquals(true, true);
	}

	@Test
	public void dataManagerTestC12() {
		Assert.assertEquals(true, true);
	}
}
