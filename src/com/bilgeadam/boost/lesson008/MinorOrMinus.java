package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class MinorOrMinus {

	public static void main(String[] args) {
	
		
		int x;
		
		Scanner o1 = new Scanner(System.in);
		System.out.println("Please enter a number");
		x = o1.nextInt();
		
		if(x>0) {
			System.out.println("This number is the positive number");
			
		}else if(x==0) {
			System.out.println("This number is the equal to 0");
		
		}else {
			System.out.println("This number is the minus number");
			o1.close();
	}
	}
}
