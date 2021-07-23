package com.Flexon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		          String sql = "CREATE TABLE Bank " +
		                   "(accountNumber INTEGER not NULL, " +
		                   " balance DOUBLE," + 
		                   " customerName VARCHAR(255), " + 
		                   " email VARCHAR(255), " + 
		                   " phoneNumber INTEGER, " + 
		                   " PRIMARY KEY ( accountNumber ))"; 

		         stmt.executeUpdate(sql);
		         System.out.println("Created table in given database...");   	  
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
	   
	}
	
	


	public void addBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		
		try {
			String sql = "INSERT INTO Bank (accountNumber, balance, customerName, email, phoneNumber)"
					+ " VALUES (?, ?, ?, ?, ?)";
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, bankAccount.getAccountNumber());
			statement.setDouble(2,  bankAccount.getBalance());
			statement.setString(3, bankAccount.getCustomerName());
			statement.setString(4, bankAccount.getEmail());
			statement.setInt(5, bankAccount.getPhoneNumber());
		 /*
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}
			*/
		} catch (SQLException e) {
		       e.printStackTrace();
		    } 
		
		
	}

	public void updateName(BankAccount bankAccount, String name) {
		// TODO Auto-generated method stub
		
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		         String sql = "UPDATE Bank " +
		            "SET customerName = '" + name + "' WHERE accountNumber =" + bankAccount.getAccountNumber();
		         stmt.executeUpdate(sql);
		         }catch (SQLException e) {
		             e.printStackTrace();
		         } 
		
	}

	public void updateEmail(BankAccount bankAccount, String email) {
		// TODO Auto-generated method stub
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		         String sql = "UPDATE Bank " +
		            "SET email = '" + email + "' WHERE accountNumber =" + bankAccount.getAccountNumber();
		         stmt.executeUpdate(sql);
		         }catch (SQLException e) {
		             e.printStackTrace();
		         } 
		
	}

	public void updatePhoneNumber(BankAccount bankAccount, int phoneNumber) {
		// TODO Auto-generated method stub
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		         String sql = "UPDATE Bank " +
		            "SET phoneNumber = '" + phoneNumber + "' WHERE accountNumber =" + bankAccount.getAccountNumber();
		         stmt.executeUpdate(sql);
		         }catch (SQLException e) {
		             e.printStackTrace();
		         } 
	}

	public void deleteAccountNumber(int accountNumber) {
		// TODO Auto-generated method stub
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		         String sql = "DELETE FROM Bank " +
		        		 "WHERE accountNumber =" + accountNumber;
		         stmt.executeUpdate(sql);
		        
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		
	}

	public void displayAllUsers() {
		// TODO Auto-generated method stub
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
		         
		      ) {
			
				String sql = "SELECT * FROM Bank";
				ResultSet rs = stmt.executeQuery(sql);
		         while(rs.next()){
		            //Display values
		            System.out.print("accountNumber: " + rs.getInt("accountNumber"));
		            System.out.print(", balance: " + rs.getDouble("balance"));
		            System.out.print(", customerName: " + rs.getString("customerName"));
		            System.out.print(", email: " + rs.getString("email"));
		            System.out.println(", phoneNumber: " + rs.getInt("phoneNumber"));
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		
	}

	public void displayUserByName(String name) {
		// TODO Auto-generated method stub
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
		         
		      ) {
			
				String sql = "SELECT * FROM Bank WHERE customerName = '" + name + "'";
				ResultSet rs = stmt.executeQuery(sql);
		         while(rs.next()){
		            //Display values
		            System.out.print("accountNumber: " + rs.getInt("accountNumber"));
		            System.out.print(", balance: " + rs.getDouble("balance"));
		            System.out.print(", customerName: " + rs.getString("customerName"));
		            System.out.print(", email: " + rs.getString("email"));
		            System.out.println(", phoneNumber: " + rs.getInt("phoneNumber"));
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		
	}

	public void depositMoney(BankAccount bankAccount, double money) {
		// TODO Auto-generated method stub
		 if(money < 5.0 || money > 10000) {
			   System.out.println("invalid mount");
		   }
		 else {
			 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
		         
		      ) {
			
				String sql = "SELECT balance FROM Bank WHERE accountNumber = " +  bankAccount.getAccountNumber();
				ResultSet rs = stmt.executeQuery(sql);
		        double balance = 0.0; 
				while(rs.next()){
		            //Display values
		        	 balance = rs.getDouble("balance");
		         }
				balance += money;
				sql = "UPDATE Bank " +
			            "SET balance = '" + balance + "' WHERE accountNumber =" + bankAccount.getAccountNumber();
			    stmt.executeUpdate(sql);
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
		 }
	}

	public void displayBalance(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
		         
		      ) {
			
				String sql = "SELECT balance FROM Bank WHERE accountNumber = " +  bankAccount.getAccountNumber();
				ResultSet rs = stmt.executeQuery(sql);
		        double balance = 0.0; 
				while(rs.next()){
		            //Display values
		        	 balance = rs.getDouble("balance");
		         }
				System.out.println("Your balance is " + balance);
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
		
	}

}
