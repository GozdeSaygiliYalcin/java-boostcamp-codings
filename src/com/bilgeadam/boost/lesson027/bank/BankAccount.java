package com.bilgeadam.boost.lesson027.bank;

public abstract class BankAccount {
	
	private int accountNumber;
	private String accountName;
	protected double balance;
	
	
	public BankAccount(int accountNumber, String accountName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = 0;
		
	}
	
	public BankAccount(int accountNumber, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public abstract void depositMoney(double amount);
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + this.accountNumber + ", accountName=" + this.accountName + ", balance="
				+ this.balance + "]";
	}
	
}
