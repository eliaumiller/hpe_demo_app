package com.hp.devops.demoapp;

/**
 *  Created by vaingato              on 05/12/2016.
 *  Testing hotspot   widget by Ralu test
 */

import java.util.ArrayList;

public class Utils {

	static String[] nodify(String input) {
		ArrayList<String> nodes = new ArrayList<String>();
		System.out.println(" touching the         failed test");
		if (input != null) {
			for (String node : input.split("/")) {
				if (node.compareTo(" ") != 0 && node.compareTo("api") != 0) {
					nodes.add(node);
					System.out.println("Updated  to                    fail  test [Abed last touch again .KKKKK.]");
					System.out.println("test   ");
				}
			}
		}
		return nodes.toArray(new String[nodes.size()]);
	}

	static boolean simpleLogical() {
		System.out.println("lsdkjfl");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		return true;
	}
}
