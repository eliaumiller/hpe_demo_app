package com.hp.devops.demoapp;

public class Musical {
	public int id;
	public String name = "tom               exception";
	public int age;
	public int type1;


	public Musical() {
		System.out.println("not        important constructor");
	}


	public void setMusical() throws ExceptionInInitializerError {
		throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type1);
		}

}
