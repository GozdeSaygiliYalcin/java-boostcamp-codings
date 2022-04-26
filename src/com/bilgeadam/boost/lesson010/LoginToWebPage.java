package com.bilgeadam.boost.lesson010;

import java.util.Scanner;

public class LoginToWebPage {

	public static void main(String[] args) {
		
		
		Scanner o1 =new Scanner(System.in);
		System.out.println("Welcome, press 1 for sign in, press 2 for register");
		int x = o1.nextInt();
		
		
		if(x==1) {
			System.out.println("Please sign in");
			
		}else if(x==2) {
			System.out.println("Enter your user name and password");
		
		}else {
		o1.close();
		System.out.println("Error, please try again");
	}
	}
}
		


	


