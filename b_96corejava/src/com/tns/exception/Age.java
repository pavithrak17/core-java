package com.tns.exception;

public class Age extends Exception {
	Age(String str){// parameter constructor
		super(str);//its overiding , to call method, class
		System.out.println(str);
	}

}
