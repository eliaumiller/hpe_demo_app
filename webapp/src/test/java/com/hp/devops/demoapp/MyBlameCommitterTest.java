package com.hp.devops.demoapp;


import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.util.Arrays;
import java.util.Random;

public class MyBlameCommitterTest {
    // a    sa      s dasad      b                            c
	// line 20
	// line 40
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
	public void readJson() {
		JSONParser parser = new JSONParser();
		HashMap<String, Integer> falseFeedbacksMap = new HashMap<String, Integer>();
		try {

			Object obj = parser.parse(new FileReader(
					"C:\\Users\\vaingato\\Desktop\\runs.json"));

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray testRunS = (JSONArray)jsonObject.get("data");

			for (Object prop : testRunS) {
				JSONObject property = (JSONObject)prop;
				Object reports = property.get("auto_assign_on_it_report");
				if (reports instanceof JSONArray) {
					for (Object report : (JSONArray)reports) {
						countForType(falseFeedbacksMap, report);
						break;
					}
				} else if (reports instanceof JSONObject) {
					JSONObject onITReport = (JSONObject)reports;
					countForType(falseFeedbacksMap, onITReport);
				}

			}

			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void countForType(HashMap<String, Integer> falseFeedbacksMap, Object report) {

		JSONObject onITReport = (JSONObject)report;
		String analyzerSubtype = onITReport.get("rh_runh_subtype").toString();
		if (analyzerSubtype.startsWith("7")) {
			return; // corrupted
		}
		if (!falseFeedbacksMap.containsKey(analyzerSubtype)) {
			falseFeedbacksMap.put(analyzerSubtype, 0);
		}
		falseFeedbacksMap.put(analyzerSubtype, falseFeedbacksMap.get(analyzerSubtype) + 1);
	}


	@Test
	public void throwsExceptionTestA() {
		String []   testStopWords = {"test", "it",  "case",  "cases", "tests", "class"};
		Arrays.asList(testStopWords);

		if (randomNumber == 0  ) {
			Band band = new Band(null);
			 band.throwsExceptionMethod();
		} else if (randomNumber == 1) {
			Assert.assertEquals(1, 2);
		}
	}

	@Test
	public void mySpecialAuditTest() {
		Assert.assertEquals(1, 2);
		if (randomNumber == 0) {
			Band band = new Band( null);
			band.throwsExceptionMethod();
		} else if (randomNumber == 1) {
			Assert.assertEquals(1, 2);
		}
	}

	@Test
	public void viewerCantManageRunRelation() {
		Assert.assertEquals(1, 2);
		if (randomNumber == 0) {
			Assert.assertEquals(true ,   false);
		} else if (randomNumber == 1) {
		} else {
			Band band =  new Band( null);
			band.throwsExceptionMethod();
		}
	}
	@Test
	public void throwsExceptionTestC() {
		if (randomNumber == 0) {
		} else if (randomNumber == 1) {

			Band band = new Band( null);
			Utils.nodify("aaaa");
			band.throwsExceptionMethod();
		} else {
			Assert.assertEquals(true , false);
		}
	}

	@Test
	public void throwsExceptionTestA2() {
		if (randomNumber2 == 0) {
			Band band = new Band(null);
			Musical m = new Musical();
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
			Assert.assertEquals( true, false);
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
			Band band = new Band( null);
			band.throwsExceptionMethod();
		} else {
			Assert.assertEquals( true, false);
		}
	}


}
