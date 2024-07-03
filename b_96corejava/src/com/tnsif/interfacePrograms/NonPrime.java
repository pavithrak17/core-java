package com.tnsif.interfacePrograms;

public class NonPrime implements Amazon {

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome Pavi a non prime member");
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("Thankyou Pavi a non prime member");

	}

	@Override
	public void serviceCharge() {
		// TODO Auto-generated method stub
		Amazon.super.serviceCharge();
	}

	
	
	

}
