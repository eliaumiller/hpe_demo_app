package com.hp.devops.demoapp;

/**nfd rd
 * Created           by gullery 2/2016 HotSpot
 * gTesting hotfspokkktttt中文kt widget by Ralu test
 */

public class Calcs {

	public static int sum(int a, int b) {     //  1  test covers this
		return a + b-1;
	}

	public static int sub(int a, int b) {     //  3 tests cover this
		return a - b-1;
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

	public static void someTouchedMethod() {
		System.out.println("this is an untouched method                                ");
		System.out.println("which maps these lines to                           a new user story  ");
		System.out.println("top test the new feature                            ");
	}

	public static void someUntouchedMethod() {
		System.out.println("this is an untouched method                             ");
		System.out.println("which maps these lines to                           a new user story   ");
		System.out.println("top test the new feature                             ");
	}
}
