package com.tnsif.encaps;

public class EncapsulationDemo {
	
	public static void main(String args[])
	{
	Encapsulation ob=new Encapsulation();
	
	//ob.name="pavi";
	//ob.age=21;
	//ob.serialNumber=98;
	ob.setAge(21);
	ob.setName("Pavi");
	ob.setSerialNumber(98);
	System.out.println(ob);
	}		

}