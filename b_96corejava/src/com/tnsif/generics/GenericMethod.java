package com.tnsif.generics;

public class GenericMethod {
	public<T>void displayArrayElements(T[] elements){ //generic method:it traverse whole data into array
		for(T ele:elements) {
			System.out.println("Elements is " +ele);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj=new GenericMethod();
		Integer[] intarray= {10, 20, 30};
		//intializing
		String[] strarr= {"Hello","Pavi"};
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(strarr);
	}

}
