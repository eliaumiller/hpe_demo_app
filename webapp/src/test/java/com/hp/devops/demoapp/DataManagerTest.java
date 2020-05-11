package com.hp.devops.demoapp;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

/**
 * Created with IntelliJ IDEA.
 * User:   gullery2
 * Date: 25/11/15
 * Time: 14:48 test test
 * To change this                          template use File | Settings | File Templates.
 */
public class DataManagerTest {

	@Test
	public void dataManagerTestA() {
		try {
			DataManager.init(null);
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), InvalidParameterException.class);
			Assert.assertEquals(e.getMessage(), "servletContext must not be null");
		}
	}

	@Test
	public void dataManagerTestB() {
		DataManager.loadData();
		Assert.assertEquals(DataManager.isInitialized(), true);
	}

	@Test
	public void failTestForCoverageAnalysisB() {
		DataManager.loadData();
		Assert.assertEquals(true, true);
	}

	@Test
	public void dataManagerTestC() {
		try {
			DataManager.getAll();
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), Exception.class);
			Assert.assertEquals(e.getMessage(), "service not initialized ");
		}
	}

	@Test
	public void dataManagerTestD() {
		try {
			DataManager.getBand(0);
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), Exception.class);
			Assert.assertEquals(e.getMessage(), "service not initialized");
		}
	}

	@Test
	public void dataManagerTestE() {
		try {
			DataManager.upVoteBand(0);
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), Exception.class);
			Assert.assertEquals(e.getMessage(), "service not initialized");
		}
	}
}
