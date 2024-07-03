// program to demonstrate interface
package com.tnsif.interfacePrograms;

public interface Amazon {

	void welcome();//abstract method
	void thankyou();//abstract method
	
default void serviceCharge() {
	int amt=100;
	System.out.println("the service charge is "+amt);
}
static void aboutUs() {
	// TODO Auto-generated method stub
	System.out.println("TLS a ecommerce website");
}

}
