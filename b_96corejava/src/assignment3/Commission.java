package assignment3;

public class Commission {
	private String Name;
    private double Salesamount;

    // Method to accept details of the sales employee
    public void acceptDetails(String name, String address, String phone, double salesamount) {
        this.Name = name;
        this.Salesamount = salesamount;
    }

    // Method to calculate the commission
    public double calculateCommission() {
        double commission = 0.0;
        if (Salesamount >= 100000) {
            commission = Salesamount * 0.10;
        } else if (Salesamount >= 50000) {
            commission = Salesamount * 0.05;
        } else if (Salesamount >= 30000) {
            commission = Salesamount * 0.03;
        }
        return commission;
    }

    // Method to display the commission
    public void displayCommission() {
        double commission = calculateCommission();
        System.out.println("The commission for " + Name + " is: " + commission);
    }

}
