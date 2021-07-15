package com.Flexon.BankDao;
import java.util.ArrayList;
import java.util.List;

public class BankAccountDaoImpl {
	
	   List<BankAccount> bankAccounts;

	   public BankAccountDaoImpl(){
		  bankAccounts = new ArrayList<BankAccount>();
	   }
	   
	   public void addBankAccount(BankAccount bankAccount) {
		   this.bankAccounts.add(bankAccount);
	   }
	  
	   public void updateName(BankAccount bankAccount, String name) {
		   for(BankAccount b : bankAccounts) {
	            if(b.equals(bankAccount)) {
	                b.setCustomerName(name);
	                break;
	            }
		   }
	   }
	   public void updateEmail(BankAccount bankAccount, String email) {
		   for(BankAccount b : bankAccounts) {
	            if(b.equals(bankAccount)) {
	                b.setEmail(email);
	                break;
	            }
		   }
	   }
	   public void updatePhoneNumber(BankAccount bankAccount, int phoneNumber) {
		   for(BankAccount b : bankAccounts) {
	            if(b.equals(bankAccount)) {
	                b.setPhoneNumber(phoneNumber);
	                break;
	            }
		   }
	   }
	   public void deleteAccountNumber(int accountNumber) {
		   for(BankAccount b : bankAccounts) {
	            if(b.getAccountNumber() == accountNumber) {
	                bankAccounts.remove(b);
	                break;
	            }
		   }
	   }
	   
	   public void displayAllUsers() {
		   for(BankAccount b : bankAccounts) {
	            b.printAll();
		   }
	   }
	   public void displayUserByName(String name) {
		   for(BankAccount b : bankAccounts) {
			   if(b.getCustomerName().equals(name)) {
	            b.printAll();
			   }
		   }
	   }
	   public void depositMoney(BankAccount bankAccount, double money) {
		   if(money < 5.0 || money > 10000) {
			   System.out.println("invalid mount");
		   }
		   else {
			   for(BankAccount b : bankAccounts) {
				   if(b.equals(bankAccount)) {
					   b.setBalance(b.getBalance() + money);
					   break;
				   }
			   }
		   }
	   }
	   public void displayBalance(BankAccount bankAccount) {
		   for(BankAccount b : bankAccounts) {
	            if(b.equals(bankAccount)) {
	            	System.out.println("Your balance is " + b.getBalance());
	                break;
	            }
		   }
	   }

}
