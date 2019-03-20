package com.hp.devops.demoapp;

public class Musical {
	public int id;
	public String name = "tom               exception";
	public int age;
	public int type1;
    public int type9;
    public int type10;
    public int type11;
    public int type12;
    public int type13;










    public int type2;


	public Musical() {
		System.out.println("not        important constructor");
	}


	public void setMusical() throws ExceptionInInitializerError {
		throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type1 + type2 + type9 + type10 + type11 + type12 + type13);
		}

}
