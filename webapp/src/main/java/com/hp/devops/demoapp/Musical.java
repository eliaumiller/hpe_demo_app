package com.hp.devops.demoapp;

import org.json.JSONObject;

import java.security.InvalidParameterException;

public class Musical {
	public int id;
	public String name = "tom      exception";

	public Musical() {
		System.out.println("not      important constructor");
	}


	public void setMusical() throws ExceptionInInitializerError{
		throw new ExceptionInInitializerError("some customize   exception with the name of " + name);
	}

}
