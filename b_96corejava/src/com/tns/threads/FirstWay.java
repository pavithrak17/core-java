package com.tns.threads;

public class FirstWay extends Thread{
	public void run() {//running
		System.out.println("Creation of thread by extending  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstWay ob=new FirstWay();//thread
		//ob.stop();
		ob.start();
		ob.stop();
		ob.start();
	}

}
