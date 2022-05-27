package com.bilgeadam.boost.lesson027.bank;

import java.util.Scanner;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(int accountNumber, String accountName) {
		super(accountNumber, accountName);
	}

	@Override
	public void depositMoney(double amountDeposit) {
		
		if(amountDeposit>0) {
			balance = balance + amountDeposit;
		}
		
			System.out.println(amountDeposit +" money is deposited to your account");
			System.out.println("Your balance is " + balance);
	}
	public void withdrawMoney(double amountWithdraw) {
	
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