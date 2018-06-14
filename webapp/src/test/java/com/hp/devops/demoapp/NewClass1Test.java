package com.hp.devops.demoapp;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Random;

/**
 * Created with  IntelliJ IDEA. Test
 * User: gullery 3usnothi1821af
 * Date: 25/11/14
 * Time: 14:21
 * To change   this     template use File | Settings | File Templates.
 */
public class NewClass1Test {
	//private String NON_RELATED;
	private Random rand = new Random();
	private int randomNumber;

	public NewClass1Test() {
		randomNumber = rand.nextInt(2) + 1;
	}

	@Test
	public void randomE1Test() {
		if (randomNumber == 1) {
			NewClass1 myClass = new NewClass1();
			myClass.methodThatThrowsException(); // null pointer
		} else {
			Assert.assertEquals(true, true);
		}
	}

	@Test
	public void randomE2Test() {
		if (randomNumber == 1) {
			NewClass1 myClass = new NewClass1();
			myClass.methodThatThrowsException(); // null pointer
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomG1Test() {
		if (randomNumber == 2) {
			NewClass1 myClass = new NewClass1();
			myClass.methodThatThrowsException(); // null pointer
		} else {
			Assert.assertEquals(true, true);
		}
	}
	@Test
	public void randomG2Test() {
		if (randomNumber == 2) {
			NewClass1 myClass = new NewClass1();
			myClass.methodThatThrowsException(); // null pointer
		} else {
			Assert.assertEquals(true, true);
		}
	}
}
