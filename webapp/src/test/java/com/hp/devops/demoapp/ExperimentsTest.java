package com.hp.devops.demoapp;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User:       gullery
 * Date: 25/11/15
 * Time: 14:48 test
 * To change this template use File  | Settings | File Templates.  
 */
public class ExperimentsTest {
	private Random rand = new Random();
	private int randomNumber;

	public ExperimentsTest() {
		randomNumber = rand.nextInt(5) + 1;
	}
	@Test
	public void randomA1Test() {
		if (randomNumber == 1) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}

	@Test
	public void randomA2Test() {
		if (randomNumber == 1) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomB1Test() {
		if (randomNumber == 2) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}

	@Test
	public void randomB2Test() {
		if (randomNumber == 2) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomC1Test() {
		if (randomNumber == 3) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomC2Test() {
		if (randomNumber == 3) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomD1Test() {
		if (randomNumber == 4) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomD2Test() {
		if (randomNumber == 4) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomE1Test() {
		if (randomNumber == 5) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomE2Test() {
		if (randomNumber == 5) {
			throw new IllegalMonitorStateException("this is a random exception");
		} else {
			Assert.assertEquals(true, true);
		}
	}
}
