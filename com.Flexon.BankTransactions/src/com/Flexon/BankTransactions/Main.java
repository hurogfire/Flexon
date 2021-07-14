package com.Flexon.BankTransactions;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();

		Scanner input = new Scanner(System.in);
		int option = 0;
		while(option !=4)
		{
		System.out.println("Please choose from following option: \n"
				+ " 1)Show Account Balance \n 2)Deposit Money \n 3)Withdraw Money \n 4)Exit");
		option = input.nextInt();
			switch(option)
			{
			case(1):
			{
				bankAccount.printBalance();
				break;
			}
			case(2):
			{
				System.out.println("Please enter the amount to deposit: ");
				double amount = input.nextDouble();
				bankAccount.deposit(amount);
				break;
			}
			case(3):
			{
				System.out.println("Please enter the amount to withdraw: ");
				double amount = input.nextDouble();
				bankAccount.withdraw(amount);
				break;
			}
			case(4):
			{
				break;
			}
			default:
				System.out.println("not a valid option");
				break;
			}
		}
	
	}

}
