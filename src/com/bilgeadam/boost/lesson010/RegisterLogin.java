package com.bilgeadam.boost.lesson010;

import java.util.Scanner;

public class RegisterLogin {

	public static void main(String[] args) {
		
		String userName= null;
		String password =null;
		String userNameEntry=null;
		String passwordEntry =null;
		
		do {
		Scanner o1 =new Scanner(System.in);
		System.out.println("Welcome, press 1 for sign in, press 2 for register");
		int x = o1.nextInt();

		switch(x) {
		
		case 1:
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome. Enter your username");
			userName = input.next();
			System.out.println("Enter your password");
			password = input.next();
			System.out.println("Your account is created");
			break;
			
		case 2:
			Scanner o2 =new Scanner(System.in);
			System.out.println("Enter your username");
			userNameEntry = o2.next();
			System.out.println("Enter your password");
			passwordEntry = o2.next();
			
			if(userNameEntry.equals(userName)&& passwordEntry.equals(password)) {
			System.out.println("Welcome");
			}
	    else  {
		System.out.println("wrong username or password please try again");
		break;
	}

	
}
		}
		while(true);
	}
}
