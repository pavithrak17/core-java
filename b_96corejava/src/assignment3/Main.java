package assignment3;

public class Main {
	public static void main(String[] args) {
		new Student();

        // Creating Commission object
        Commission commission = new Commission();

        // Accepting details of the sales employee
        commission.acceptDetails("Pavithra", "17 Bengaluru", "80955646534", 85000);

        // Calculating and displaying the commission
        commission.displayCommission();
    }
}
