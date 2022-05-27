package com.bilgeadam.boost.lesson027.bank;

import java.util.ArrayList;
import java.util.List;

public class BankTest {
	

	public static void main(String[] args) {
		
		CheckingAccount chAcc1 = new CheckingAccount(1, "gozde' account");
		CheckingAccount chAcc2 = new CheckingAccount(2, "alis' account");
		
		SavingAccount shAcc1 = new SavingAccount(3, "boncuk' account");
		SavingAccount shAcc2 = new SavingAccount(4, "velis' account");
		
		shAcc1.getBalance(); //current starting balance
		System.out.println("new account is created, your balance is: " + shAcc1.getBalance());
		
		chAcc1.depositMoney(40);
		shAcc1.getEarning();
		
		
		List<BankAccount> accountList =new ArrayList<>();
		accountList.add(shAcc1);
		accountList.add(shAcc2);
		accountList.add(chAcc1);
		accountList.add(chAcc2);
		
		
		Bank bank = new Bank("garanti", accountList);
		System.out.println(bank);
		
	

	}

}
