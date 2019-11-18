package com.hp.devops.demoapp.tests.ui;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shitritn on 4/9/2017.
 *
 */
public class TestD {

	@Test
	public void testUIcaseAlwaysPass() {
		System.out.println("Proudly  running test " + Thread.currentThread().getStackTrace()[1]);
		Assert.assertTrue(true);
	}
}

