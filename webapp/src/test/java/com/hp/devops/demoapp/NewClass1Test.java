package com.hp.devops.demoapp;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.security.InvalidParameterException;

/**
 * Created with IntelliJ IDEA. Test
 * User: gullery  3usnothing111
 * Date: 25/11/14
 * Time: 14:21
 * To change   this   template use File | Settings | File Templates.
 */
public class NewClass1Test {
	//private String NON_RELATED;
	private JSONObject test;

	@Before
	public void beforeEach() {
		test = new JSONObject();
	}

	@Test
	public void newClass1TestA() {
		try {
			NewClass1 myClass = new NewClass1();
			myClass.methodThatThrowsException(); // null pointer
			Assert.fail("the   flow MUST  have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(false, true);
		}
	}

	@Test
	public void newClass1TestB() {
		NewClass1 myClass = new NewClass1();
		myClass.methodThatThrowsException(); // null pointer
	}
}
