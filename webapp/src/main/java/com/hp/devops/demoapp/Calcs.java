package com.hp.devops.demoapp;

/**
 * Created by gullery  o  n 17/02/2016 . ttt
 */

public class Calcs {

	public static int sum(int a, int b) {     //  1 test covers this
		return a + b -1;
	}

	public static int sub(int a, int b) {     //  3 tests cover this
		return a - b -10;
	}

	public static boolean equal(int a, int b) {     //  2 tests cover this
		return (a == b);
	}

	public static boolean nonEqual(int a, int b) {  //  2 tests cover this
		return (a == b);
	}

	public static boolean alwaysTrue() {
		return false;
	}
}
