//program to demonstrate interface
package com.assignment.programs;
public interface Amazon {

	void welcome();//abstract method
	void thankyou();//abstract method

	static int price() {
	int amt=10000;
	System.out.println("The price of the product is "+amt);
	return amt;
}
static void aboutUs() {
	// TODO Auto-generated method stub
	System.out.println("Its a Ecommerce Website of Amazon");
}
}