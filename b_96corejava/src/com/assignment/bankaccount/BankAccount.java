//Assessment Exception Handling:
package com.assignment.bankaccount;
//BankAccount.java
 public class BankAccount {
 private int accountNumber;
 private double balance;

 // Constructor
 public BankAccount(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     if (initialBalance < 0) {
         throw new InvalidAmountException("Initial balance cannot be negative");
     }
     this.balance = initialBalance;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be positive");
     }
     balance += amount;
 }

 // Method to withdraw money
 public void withdraw(double amount) throws InsufficientFundsException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be positive");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds for withdrawal");
     }
     balance -= amount;
 }

 // Method to display the balance
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }
}
