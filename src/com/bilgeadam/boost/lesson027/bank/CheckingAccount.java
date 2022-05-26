package com.bilgeadam.boost.lesson027.bank;

import java.util.Scanner;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(int accountNumber, String accountName, int balance) {
		super(accountNumber, accountName, balance);
	}

	@Override
	public void depositMoney(double amountDeposit) {
		
		System.out.println(amountDeposit +" money is deposited to your account");
		
	}
	public void withdrawMoney(double amountWithdraw) {
		
		 System.out.println("Please enter amount of the money that you wanted withdraw");
		 Scanner input = new Scanner(System.in);
		 amountWithdraw= input.nextInt();
		 
			 if (amountWithdraw>this.getBalance()) {
				 System.out.println("Insufficient balance!");	 
			 } 
			 else if (getBalance()>amountWithdraw)	 {
				
			double currentBalance = getBalance()-amountWithdraw;
			
				 System.out.println("You withdrawed " + amountWithdraw +" of money");
				 System.out.println("Your balance is " + currentBalance);
				
		 	}
	}
}