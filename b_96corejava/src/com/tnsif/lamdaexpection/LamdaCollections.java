package com.tnsif.lamdaexpection;
import java.util.ArrayList;
public class LamdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li=new ArrayList<>();
		li.add(22);
		li.add(36);
		li.add(44);
		li.forEach(e->System.out.println(e));
	}

}
