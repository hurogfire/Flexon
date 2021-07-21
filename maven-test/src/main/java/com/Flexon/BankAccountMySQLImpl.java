package com.Flexon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BankAccountMySQLImpl implements BankAccountDao {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://testdatabase-july21.cztwzwlfern6.us-east-1.rds.amazonaws.com:3306/BankDB";
	static final String USER = "admin";
	static final String PASS = "testadmin";
	
	public BankAccountMySQLImpl(){
		System.out.println("Connecting to a selected database...");
	    // Open a connection
	    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {		      
	       System.out.println("Connected database successfully...");  
	    } catch (SQLException e) {
	       e.printStackTrace();
	    } 
	}
	
	


	public void addBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		
	}

	public void updateName(BankAccount bankAccount, String name) {
		// TODO Auto-generated method stub
		
	}

	public void updateEmail(BankAccount bankAccount, String email) {
		// TODO Auto-generated method stub
		
	}

	public void updatePhoneNumber(BankAccount bankAccount, int phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAccountNumber(int accountNumber) {
		// TODO Auto-generated method stub
		
	}

	public void displayAllUsers() {
		// TODO Auto-generated method stub
		
	}

	public void displayUserByName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void depositMoney(BankAccount bankAccount, double money) {
		// TODO Auto-generated method stub
		
	}

	public void displayBalance(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		
	}

}
