package com.bilgeadam.boost.lesson027.bank;

public class SavingAccount extends BankAccount{
	
	private static final double INTEREST_RATE = 1.2;
	private double period;
	

	public SavingAccount(int accountNumber, String accountName, int balance) {
		super(accountNumber, accountName, balance);
		
	}
	
	public double getEarning() {
		return this.period*this.INTEREST_RATE;
	}


	@Override
	public void depositMoney(double amount) {
		// TODO Auto-generated method stub
		
	}
}
