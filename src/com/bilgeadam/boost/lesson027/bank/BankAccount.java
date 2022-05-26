package com.bilgeadam.boost.lesson027.bank;

public abstract class BankAccount {
	
	private int accountNumber;
	private String accountName;
	private int balance;
	
	
	public BankAccount(int accountNumber, String accountName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		
	}
	public abstract void depositMoney(double amount);
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + this.accountNumber + ", accountName=" + this.accountName + ", balance="
				+ this.balance + "]";
	}
	
}
