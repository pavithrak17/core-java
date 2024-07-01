package com.tnsif.staticprogram;

public class Student {
	private String name;//instance variable
	private int id;
	
	static String clgName="DBIT";//static variable

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
 //to access the content toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}
