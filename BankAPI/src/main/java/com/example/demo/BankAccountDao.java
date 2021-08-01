package com.example.demo;

public interface BankAccountDao {
	
	   public void addBankAccount(BankAccount bankAccount) ;
	   public void updateName(BankAccount bankAccount, String name) ;
	   public void updateEmail(BankAccount bankAccount, String email) ;
	   public void updatePhoneNumber(BankAccount bankAccount, int phoneNumber) ;
	   public void deleteAccountNumber(int accountNumber) ;
	   public void displayAllUsers();
	   public void displayUserByName(String name) ;
	   public void depositMoney(BankAccount bankAccount, double money) ;
	   public void displayBalance(BankAccount bankAccount);
}
