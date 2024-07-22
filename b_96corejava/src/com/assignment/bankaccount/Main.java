package com.assignment.bankaccount;
//Main.java

public class Main {
 public static void main(String[] args) {
     try {
         // Creating a bank account
         BankAccount account = new BankAccount(12345, 500.00);
         account.displayBalance();

         // Depositing money
         try {
             account.deposit(200);
             System.out.println("Deposit successful.");
             account.displayBalance();
         } catch (InvalidAmountException e) {
             System.out.println(e.getMessage());
         }

         // Withdrawing money
         try {
             account.withdraw(100);
             System.out.println("Withdrawal successful.");
             account.displayBalance();
         } catch (InvalidAmountException | InsufficientFundsException e) {
             System.out.println(e.getMessage());
         }

     } catch (InvalidAmountException e) {
         System.out.println(e.getMessage());
     } finally {
         System.out.println("Bank account operations completed.");
     }
 }
}
