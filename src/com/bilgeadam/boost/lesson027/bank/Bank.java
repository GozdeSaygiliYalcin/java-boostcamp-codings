package com.bilgeadam.boost.lesson027.bank;

import java.util.List;

public class Bank {
	
	private String bankName;
	List<BankAccount> accounts;

	public Bank(String bankName, List<BankAccount> accounts) {
		super();
		this.bankName = bankName;
		this.accounts = accounts;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<BankAccount> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + this.bankName + ", accounts=" + this.accounts + "]";
	}
	
}
