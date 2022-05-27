package com.bilgeadam.boost.lesson028.afternoon;

import java.util.Scanner;

public class RecursiveMethodExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number:");
		
		int num = input.nextInt();
		System.out.println("sum of digits of " +num + " is " +sum(num));
		

	}
	
	public static int sum(int n) {
		
		return n==0 ? 0 : n%10 + sum(n/10);
	}

}
