package com.bilgeadam.boost.lesson010;

import java.util.Scanner;

public class AtmPassword {

	public static void main(String[] args) {
		
		String userName = "gozde";
		String password = "123";
		int entry =3;
		int operator;
		int amount;
		double balance = 1500;
		Scanner o1 =new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter your username:");
			userName = o1.nextLine();
			
			System.out.print("Enter your password:");
			password = o1.nextLine();
			
			if (userName.equals("gozde") && password.equals("123")) {
				 System.out.println("Welcome");
				 while(true) {
				 do {
					 System.out.println("1-Deposit Money\n" + "2-Withdraw Money\n" + "3-Balance Inquiry\n" + "4-Quit to the System");
					 System.out.print("Please select your operation you want to do:");
					 operator = o1.nextInt();
					 if(operator ==1) {
						 System.out.print("The amount of the money :");
						 amount = o1.nextInt();
						 balance = balance + amount; //balance +=amount
						 System.out.println(amount +" money is deposited to your account");
						 System.out.println("Your balance is " + balance);
						 break;
						 
					 } else if (operator==2) {
						 System.out.println("Please enter amount of the money that you wanted withdraw");
						 amount= o1.nextInt();
						 if (amount>balance) {
							 System.out.println("Insufficient balance!");
						 } else if (balance>amount)	 {
							 balance = balance-amount;
							 System.out.println("You withdrawed " + amount +" of money");
							 System.out.println("Your balance is " + balance);
							 break;
							 
					 } else if (operator==3) {
						 System.out.println("Your Balance is :" + balance);
						 
					 } else if (operator==4) {
						 System.out.println("You are quitting the system");
						 } else {
						 }	 
						 }
					 System.out.println("Thanks for using this application, see you later");
					 amount = o1.nextInt();
							 balance -= amount;
							 break;
				
					} while (entry !=4);
					System.out.println("Bye");
					break;
			 }		
			 } else {
				entry--;
				System.out.println("Wrong username or password please try again");
				if(entry == 0) {
					System.out.println("Your account is blocked");
					o1.close();
					break;
				}else {
					System.out.println(entry +" is left");
			}
		}		 
			 
}
}

}

