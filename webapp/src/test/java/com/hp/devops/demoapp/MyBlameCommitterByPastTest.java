package com.hp.devops.demoapp;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by  gullery          on 17/02/2016. testtted in pipeline 111
 * test raluca test
 ****adad 做了更改与测试
 * this is new *usr2
 */
public class MyBlameCommitterByPastTest {
	private static Random rand = new Random();
	private static int randomNumber = rand.nextInt(3);

	// if committed a change to calc, the new analyzer will find you as responsible!
	@Test
	public void blameCommitterPastTestA() {     //  1  test covers this
		if (randomNumber > 0) {
			Calcs.randomThrowExceptionMethodA();
		}
	}

	// if committed a change to calc, the new analyzer will find you as responsible!
	@Test
	public void blameCommitterPastTestB() {     //  1  test covers this
		if (randomNumber == 1) {
			Calcs.randomThrowExceptionMethodB();
		}
	}
	@Test
	public void blameCommitterPastTestC() {     //  1  test covers this
		if (randomNumber == 2) {
			Calcs.randomThrowExceptionMethodB();
		}
	}

	@Test
	public void blameCommitterPastTestC() {
		if (randomNumber >= 1) {
			Calcs.randomThrowExceptionMethodC();
		}
	}
}
