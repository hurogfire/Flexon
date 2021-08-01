package com.example.demo;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	ArrayListBankAccountDao bankDao = new ArrayListBankAccountDao();
	
	@GetMapping("/helloAPI")
	public ArrayList<BankAccount> hello(){
		return bankDao.bankAccounts;
	}
	
	@PostMapping("/addBankAccount")
	public String addBankAccount(@RequestBody BankAccount bankAccount){
		bankDao.addBankAccount(bankAccount);
		return bankAccount.getCustomerName() + " added";
	}
	
	@PostMapping("/updateName/{name}")
	public String updateName(@RequestBody BankAccount bankAccount, @PathVariable String name) 
	{
		bankDao.updateName(bankAccount, name);
		return bankAccount.getCustomerName() + " name updated";
	}
	
	
	@PostMapping("/updateEmail/{email}")
	public String updateEmail(@RequestBody BankAccount bankAccount, @PathVariable String email) 
	{
		bankDao.updateEmail(bankAccount, email);
		return bankAccount.getCustomerName() + " email updated";
	}
	
	@PostMapping("/updatePhoneNumber/{phoneNumber}")
	public String updatePhoneNumber(@RequestBody BankAccount bankAccount, @PathVariable int phoneNumber) 
	{
		bankDao.updatePhoneNumber(bankAccount, phoneNumber);
		return bankAccount.getCustomerName() + " phoneNumber updated";
	}
	
	@DeleteMapping("/deleteAccountNumber/{accountNumber}")
	public String deleteAccountNumber(@PathVariable int accountNumber) 
	{
		bankDao.deleteAccountNumber(accountNumber);
		return ""+accountNumber + " deleted";
	}
	
	@GetMapping("/displayAllUsers")
	public String displayAllUsers(){
		bankDao.displayAllUsers();
		return "All users displayed";
	}
	@GetMapping("/displayUserByName/{name}")
	public String displayUserByName(@PathVariable String name){
		bankDao.displayUserByName(name);
		return name + " displayed";
	}
	@PostMapping("/depositMoney/{money}")
	public String depositMoney(@RequestBody BankAccount bankAccount, @PathVariable double money){
		bankDao.depositMoney(bankAccount, money);
		return bankAccount.getCustomerName() + " money updated";
	}
	@GetMapping("/displayBalance")
	public String displayBalance(@RequestBody BankAccount bankAccount){
		bankDao.displayBalance(bankAccount);
		return bankAccount.getCustomerName() + " balance displayed";
	}
}
