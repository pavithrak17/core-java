package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList ob =new ArrayList();
//		System.out.println("The size of the arrayList"+" "+ob.size());
//		ob.add(2);
//		ob.add('a');
//		ob.add(22.35);
//		System.out.println("The elements of the array are"+ ob);
//		System.out.println("check the element is there or not" + ob.contains (22.35));
//		System.out.println("remove the specified element From the list " + ob.remove(0));
//		System.out.println("the elements of the array are"+ ob);
		ArrayList <String>ob=new ArrayList <String>();
		ob.add("Bangalore");
		ob.add("MYsore");
		ob.add("Hubli");
		System.out.println("The elements of the array are"+ ob);
		Collections.sort(ob);
		System.out.println("The elements of the array are"+ ob);
		
		Iterator<String> i=ob.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			//ob.remove(0);
			System.out.println(nm);
		}	
}
}
