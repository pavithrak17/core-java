package utilities;

import employees.Developer;
import employees.Member;

public class AssignmentMain {
	public static void main(String args[])
	{
		Member  ob=new Member();
		
		ob.setName("Veena");
		ob.setManagerid(14);
		ob.setSalary(125000);
		
		System.out.println(ob);
    }
	
	{
	Developer obj=new Developer();
	
	obj.setName("Raki");
	obj.setDeveloperid(15);
	obj.setSalary(200000);
	
	System.out.println(obj);
	}
}