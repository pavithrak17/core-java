package com.tns.exception;
import java.util.Scanner;
public class UserDefined {
	private static int age;
	
	static void validate() throws Age {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		if(age<18) {
			throw new Age ("Invalid age");
		}
		else {
			System.out.println("Valid age");
		}
	}
}
