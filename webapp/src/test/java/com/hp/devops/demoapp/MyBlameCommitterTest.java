package com.hp.devops.demoapp;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Random;

public class MyBlameCommitterTest {

	private static Random rand;
	private static int randomNumber;

	@Before
	public void beforeEach() {
		rand = new Random();
		randomNumber = rand.nextInt(3);
	}


	@Test
	public void throwsExceptionTestA() {
		Band band = new Band(null);
		band.throwsExceptionMethod();
		if (randomNumber == 0) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else if (randomNumber == 1) {
			Assert.assertEquals(true, false);
		}
		Assert.assertEquals(true, true);
        //Assert.assertEquals(true, false);
	}

	@Test
	public void throwsExceptionTestB() {
		Band band = new Band(null);
		band.throwsExceptionMethod();
		if (randomNumber == 1) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else if (randomNumber == 0) {
			Assert.assertEquals(true, true);
		}
        Assert.assertEquals(true, false);
	}
	@Test
	public void throwsExceptionTestC() {
		Band band = new Band(null);
		band.throwsExceptionMethod();
		if (randomNumber == 2) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else if (randomNumber == 1) {
			Assert.assertEquals(true, true);
		}
        Assert.assertEquals(true, false);
	}

}
