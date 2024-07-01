package com.tnsif.staticprogram;

public class Myclass {
	private int section;//instance variable
	static int srNo;//static variable
	
	//static block
	static {
		System.out.println("----static Block----");
		srNo=1000;
		//section++;
	}
	public Myclass() {
		super();
		System.out.println("---Default Constructor---");//we not created object so it wont display | if we creat object thn only it display
	}
	
	static void display() {
		System.out.println("----static Method----");
		System.out.println("the serial no is "+srNo++);
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}

}
