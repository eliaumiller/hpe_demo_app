package com.hp.devops.demoapp;

public class Musical {
	public int id;
	public String name = "tom  exception";
	public int age;
    public int name1;
    public int name2;
    public int name3;
    public int name4;
    public int name5;
    public int name6;
    public int name8;
    public int nameVul;
    public int nameVul1;
    public int nameVul2;
    public int nameVul3;
    public int nameVul4;
    public int vul;
    public int v;
    public int v2;
    public int vulnerab;
    public int vulnerability;



















    public int vulnerabilitate;
    public int vulnerabilitate2;


    public int vulnerability2;



    public int vulnerability1;








    public int vvvvul;


	public Musical() {
		System.out.println("not important constructor");
		System.out.println("HEllo World!");
		System.out.println("Hi!");
	}

	public void setMusical() throws ExceptionInInitializerError {
		throw new ExceptionInInitializerError("some customize exception with the name of " + name  + age  + name1 +
				name2 + name3 + name4 + name5 + name6 + name8 + nameVul + vulnerab +
		nameVul1 + nameVul2 + nameVul3 + nameVul4 + vul +v + v2 + vulnerability + vulnerability1+vulnerability2+vulnerabilitate+vulnerabilitate2 + vvvvul);
		}
}
