package com.assignment.programs;

public class ProductOffers implements Amazon, Flipkart {

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("welcome pavi to the website");
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("Thankyou");
	}

	public void bestOffer() {
		
		Amazon.aboutUs();//static method
		int amazon = Amazon.price(); 
		Flipkart.aboutUs();//static method
		int flipkart = Flipkart.price();
		
		if ( amazon < flipkart) { //comparing the prices
			System.out.println("The best offers in the website of amazon: "+amazon);
		}
		else {
			System.out.println("The best offers in the website of flipkart : "+flipkart);
		}
	}	
}

