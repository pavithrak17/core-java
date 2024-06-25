//Program to demonstrate encapsulation
// which oops concept we are considering : Data Encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	//if no access specifier is mentioned then it will be default
	int serialNum;//Data variables
	String name;//its a class and built in class in java String
	int age;
	
	void show()//Member function
	{
		System.out.println("serialnumber" +serialNum+"\t Name" +name+"\t Age:" +age);
	}
}
