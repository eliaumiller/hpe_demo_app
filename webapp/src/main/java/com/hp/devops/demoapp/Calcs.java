package com.hp.devops.demoapp;

/**
 * Created by gullery on 18/02/2016. gfgf   fang1440
 *
 */

public class Calcs {

	public static int sum(int a, int b) {     //  1 test covers this
		return a + b;
	}

	public static int sub(int a, int b) {     //  3 tests cover this
		return a - b;
	}

	public static boolean equal(int a, int b) {     //  2 tests cover this
		return (a == b);
	}

	public static boolean nonEqual(int a, int b) {  //  2 tests cover this
		return (a == b);
	}

	public static boolean alwaysTrue() {
		return true;
	}
	public static boolean alwaysFalse() {
		return false;
	}
}
