package com.bilgeadam.boost.lesson027.bank;

public class SavingAccount extends BankAccount{
	
	private static final double INTEREST_RATE = 1.2;

		public SavingAccount(int accountNumber, String accountName) {
		super(accountNumber, accountName);
		
	}
	
	public void getEarning() {
		double earning = getBalance()*this.INTEREST_RATE;
		depositMoney(earning);
	}

	@Override
	public void depositMoney(double earning) {

		if(earning>0) {
			balance = balance + earning;
		}

			System.out.println(earning +" money is deposited to your account");
			System.out.println("Your balance is " + balance);
	}
}
