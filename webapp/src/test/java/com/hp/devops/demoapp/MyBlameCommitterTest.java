package com.hp.devops.demoapp;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Random;

public class MyBlameCommitterTest {
    // a                                           b                             c
	private static Random rand;
	private static int randomNumber, randomNumber2, randomNumber3;

	@Before
	public void beforeEach() {
		rand = new Random();
		randomNumber = rand.nextInt(3);
		randomNumber2 = rand.nextInt(3);
		randomNumber3 = rand.nextInt(3);
	}


	@Test
	public void throwsExceptionTestA() {
		if (randomNumber == 0) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else if (randomNumber == 1) {
			Assert.assertEquals(1, 2);
		}
	}

	@Test
	public void throwsExceptionTestB() {
		if (randomNumber == 0) {
			Assert.assertEquals(true, false);
		} else if (randomNumber == 1) {
		} else {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		}
	}
	@Test
	public void throwsExceptionTestC() {
		if (randomNumber == 0) {
		} else if (randomNumber == 1) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else {
			Assert.assertEquals(true, false);
		}
	}

	@Test
	public void throwsExceptionTestA2() {
		if (randomNumber2 == 0) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else if (randomNumber2 == 1) {
			Assert.assertEquals(1, 2);
		}
	}

	@Test
	public void throwsExceptionTestB2() {
		if (randomNumber2 == 0) {
			Assert.assertEquals(true, false);
		} else if (randomNumber2 == 1) {
		} else {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		}
	}
	@Test
	public void throwsExceptionTestC2() {
		if (randomNumber2 == 0) {
		} else if (randomNumber2 == 1) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else {
			Assert.assertEquals(true, false);
		}
	}

	@Test
	public void throwsExceptionTestA3() {
		if (randomNumber3 == 0) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else if (randomNumber3 == 1) {
			Assert.assertEquals(1, 2);
		}
	}

	@Test
	public void throwsExceptionTestB3() {
		if (randomNumber3 == 0) {
			Assert.assertEquals(true, false);
		} else if (randomNumber3 == 1) {
		} else {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		}
	}
	@Test
	public void throwsExceptionTestC3() {
		if (randomNumber3 == 0) {
		} else if (randomNumber3 == 1) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		} else {
			Assert.assertEquals(true, false);
		}
	}

}
