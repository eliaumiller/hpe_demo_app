package com.hp.devops.demoapp;

public class Musical {
	public int id;
	public String name = "tom               exception";
	public int age;
	public int type;
	public int type2;
	public int type3;
	public int type4;
	public int type5;
	public int type6;
	public int type7;
	public int type8;
	public int type9;
	public int type10;
	public int type11;

	public int type12;


	public Musical() {
		System.out.println("not        important constructor");
	}


	public void setMusical() throws ExceptionInInitializerError {
		throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type + type2 + type3 + type4+ type5 + type6 + type7 + type8 + type9 + type10 + type11 + type12);
		}

}
