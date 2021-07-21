package com.Flexon;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		
		BankAccountMySQLImpl bankAccountMySQLImpl = new BankAccountMySQLImpl();
		BankAccount b1 = new BankAccount();
		BankAccount b2  = new BankAccount(123, 40.0, "a", "a@gmail.com", 123);
		bankAccountMySQLImpl.addBankAccount(b1);
		bankAccountMySQLImpl.addBankAccount(b2);
		bankAccountMySQLImpl.updateName(b1, "c");
		bankAccountMySQLImpl.updateEmail(b1, "c@gmail.com");
		bankAccountMySQLImpl.updatePhoneNumber(b1, 1);
		bankAccountMySQLImpl.deleteAccountNumber(123);
		bankAccountMySQLImpl.depositMoney(b1, 10.0);
		bankAccountMySQLImpl.displayUserByName("c");
		bankAccountMySQLImpl.displayBalance(b1);
		bankAccountMySQLImpl.displayAllUsers();
		
	
	}

}
