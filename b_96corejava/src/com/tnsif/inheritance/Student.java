package com.tnsif.inheritance;

public class Student extends Customer {
	private String collagename;
	private int rollno;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name,int id,long adharNo,long phoneNo,String collagename, int rollno) {
		super();
		this.collagename = collagename;
		this.rollno = rollno;
	}


	public String getCollagename() {
		return collagename;
	}


	public void setCollagename(String collagename) {
		this.collagename = collagename;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	@Override
	public String toString() {
		return "Student [collagename=" + collagename + ", rollno=" + rollno + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAdharNo()=" + getAdharNo() + ", getPhoneNo()=" + getPhoneNo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
