package com.tnsif.generics;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String>stringobj=new Generic();
		stringobj.setData("hello");
		System.out.println("The string object " +stringobj.getData());
		
		Generic<Integer>intobj=new Generic();
		intobj.setData(22);
		System.out.println("The Integer object " +intobj.getData());
		
		Generic<Double>doubleobj=new Generic();
		doubleobj.setData(22.67);
		System.out.println("The double object " +doubleobj.getData());
		
	}

}
