package com.bilgeadam.boost.lesson027.bank;

public class BankTest {

	public static void main(String[] args) {
		
		CheckingAccount chAcc1 = new CheckingAccount(1, "gozde", 120);
		
		SavingAccount shAcc1 = new SavingAccount(2, "boncuk", 240);
		
		chAcc1.depositMoney(23);
		chAcc1.withdrawMoney(45);

	}

}
