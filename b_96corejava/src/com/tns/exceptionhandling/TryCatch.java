// program to demonstrate try multiple catch block
package com.tns.exceptionhandling;

public class TryCatch {
	public static void divide() {
	int a=6,b=0,c;
	try {
		 c=a/b;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("except.ion caught."+e.getMessage());
	}
	catch(ArithmeticException e) {
		System.out.println("except.ion caught."+e.getMessage());
	}
	catch(Exception e) {
		System.out.println("except.ion caught."+e.getMessage());
	}
	}
}
