/*Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
*/
package com.assessment;

import java.util.Scanner;

class Account {
	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public Account(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit Successfull.\nNew Balance is : " + balance);
		} else {
			System.out.println("Invalid Deposit Amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawal Successfull.\nNew Balance is : " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public String toString() {
		return "Account Number: " + accountNumber + " Account Holder : " + accountHolderName + " Balance : " + balance;
	}
}

class Bank {
	private Account[] accounts;
	private int count;

	public Bank(int capacity) {
		accounts = new Account[capacity];
		count = 0;
	}

	public void addAccount(Account account) {
		if (count < accounts.length) {
			accounts[count] = account;
			count++;
			System.out.println("Account Added Successfully.");
		} else {
			System.out.println("Bank is full.Cannot add more Accounts.");
		}
	}

	public void removeAccount(String accountNumber) {
		for (int i = 0; i < count; i++) {
			if (accounts[i].getAccountNumber().equals(accountNumber)) {
				for (int j = i; j < count - 1; j++) {
					accounts[j] = accounts[j + 1];
				}
				accounts[count - 1] = null;
				count--;
				System.out.println("Account removed Successfully.");
				return;
			}
		}
		System.out.println("Account not found.");
	}

	private Account findAccount(String accountNumber) {
		for (int i = 0; i < count; i++) {
			if (accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = findAccount(accountNumber);
		if (account != null) {
			account.deposit(amount);
		} else {
			System.out.println("Account Not Found.");
		}
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = findAccount(accountNumber);
		if (account != null) {
			account.withdraw(amount);
		} else {
			System.out.println("Account Not Found.");
		}
	}

	public void displayAllAccounts() {
		if (count == 0) {
			System.out.println("No accounts to display.");
		}

		else {
			for (int i = 0; i < count; i++) {
				System.out.println(accounts[i]);
			}
		}
	}

}

public class ProblemSeven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Bank bank = new Bank(10);

		while (true) {
			System.out.println("\nBank Application Menu");
			System.out.println("\n1.Add Account");
			System.out.println("2.Remove Account");
			System.out.println("3.Deposit Money");
			System.out.println("4.Withdraw Money");
			System.out.println("5.Display all Accounts");
			System.out.println("6.Exit");

			System.out.println("Enter your Choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter Account Number : ");
				String accountNumber = sc.next();
				System.out.println("Enter Account Holder Name : ");
				String accountHolderName = sc.next();
				System.out.println("Enter Initial Balance  : ");
				double initialBalance = sc.nextDouble();
				bank.addAccount(new Account(accountNumber, accountHolderName, initialBalance));
				break;

			case 2:
				System.out.println("Enter Account Number to Remove:");
				String removeAccountNumber = sc.next();
				bank.removeAccount(removeAccountNumber);
				break;
			case 3:
				System.out.println("Enter Account Number :");
				String depositAccountNumber = sc.next();
				System.out.println("Enter Amount to Deposit :");
				double depositAmount = sc.nextDouble();
				bank.deposit(depositAccountNumber, depositAmount);
				break;
			case 4:
				System.out.println("Enter Account Number :");
				String withdrawAccountNumber = sc.next();
				System.out.println("Enter Amount to Withdraw :");
				double withdrawAmount = sc.nextDouble();
				bank.withdraw(withdrawAccountNumber, withdrawAmount);
				break;
			case 5:
				bank.displayAllAccounts();
				break;
			case 6:
				System.out.println("Exiting Application.");
				sc.close();
				return;
			default:
				System.out.println("Invalid Choice.Please try Again");

			}
		}

	}

}
