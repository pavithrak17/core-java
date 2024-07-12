package com.tns.exception;
import java.io.IOException;// IOException is checked exception
public class ThrowsDemo {
	public static void main(String[] args) {
		Throws ob=new Throws();
		try {
			ob.display();
		}
		catch(IOException e) {
			System.out.println("exception caught"+e.getMessage());
		}
	}
}
