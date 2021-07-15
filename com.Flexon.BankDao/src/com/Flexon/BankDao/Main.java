package com.Flexon.BankDao;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		
		BankAccountDaoImpl bankAccountDaoImpl = new BankAccountDaoImpl();
		BankAccount b1 = new BankAccount();
		BankAccount b2  = new BankAccount(123, 40.0, "a", "a@gmail.com", 123);
		bankAccountDaoImpl.addBankAccount(b1);
		bankAccountDaoImpl.addBankAccount(b2);
		bankAccountDaoImpl.updateName(b1, "c");
		bankAccountDaoImpl.updateEmail(b1, "c@gmail.com");
		bankAccountDaoImpl.updatePhoneNumber(b1, 1);
		bankAccountDaoImpl.deleteAccountNumber(123);
		bankAccountDaoImpl.depositMoney(b1, 10.0);
		bankAccountDaoImpl.displayUserByName("c");
		bankAccountDaoImpl.displayBalance(b1);
		bankAccountDaoImpl.displayAllUsers();
		
	
	}

}
