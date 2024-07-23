package com.tnsif.generics;

import java.util.ArrayList;

public class GenericsinJava
{
    public static void main(String[] args)
    {
    	
        ArrayList list = new ArrayList();// raw type 
        //ArrayList<String> list=new ArrayList<String>();//generic method: integer will get error
        list.add("JAVA");
        list.add(123);// integer

        for (Object object : list)
        {
            // Below statement throws ClassCastException at run time
            String str = (String) object; // Type casting// explicit:forcesfully printing integer
            System.out.println(str);
        }
    }
}

