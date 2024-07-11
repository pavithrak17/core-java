package Exception;

public class WithoutException {
	public static void main(String args[]) {
		int d=0;
		try {
		int a= 42/d;// exception is raised
		System.out.println("");
		}
		catch(ArithmeticException e) {
		System.out.println("Exception Handles Successfully"+e.getMessage());
		}
		System.out.println("Will not Printed");
	}
}
