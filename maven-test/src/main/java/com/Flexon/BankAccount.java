package com.Flexon;

public class BankAccount {
	
	private int accountNumber = 123456789;
	private double balance = 50.0;
	private String customerName = "abc";
	private String email = "abc@gmail.com";
	private int phoneNumber = 123456789;
	
	public BankAccount() {
		
	}
	public BankAccount(int accountNumber, double balance, String customerName,
	String email, int phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
		}
		else {
			System.out.println("Withdraw insuccessful , insufficient amount left");
		}
	}
	
	public void printBalance() {
		System.out.println(this.customerName + ", your balance is " + this.balance );
	}
	public void printAll() {
		System.out.println("Your customer name is " + this.customerName);
		System.out.println("Your account number is " + this.accountNumber);
		System.out.println("Your balance is " + this.balance);
		System.out.println("Your email is " + this.email);
		System.out.println("Your phone number is " + this.phoneNumber);
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
