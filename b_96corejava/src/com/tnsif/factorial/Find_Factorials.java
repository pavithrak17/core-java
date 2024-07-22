package com.tnsif.factorial;
import java.util.Scanner;
public class Find_Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number for find factorial :");
		int num=scan.nextInt();
	// Lamda expression	to calculate factorial
	  Factorial factorial =(n)-> {
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;//calculate the factorial using for loop
		}
		return f;
	};
	//call the Lamda expression to calculate factorial
	int result = factorial.cal(num);
		System.out.println("Factorial of the " +num+ " is " +result);
	}

}
