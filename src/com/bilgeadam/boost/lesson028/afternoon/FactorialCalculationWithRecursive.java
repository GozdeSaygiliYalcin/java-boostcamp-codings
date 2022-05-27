package com.bilgeadam.boost.lesson028.afternoon;

import java.util.Scanner;

public class FactorialCalculationWithRecursive {

	public static void main(String[] args) {
	
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		
		int num = input.nextInt();
		System.out.println("The factorial of " +num + " is " +factorial(num));
		
			}
		}
		public static int factorial(int n) {	
			return n == 1 ? 1 : n*factorial(n-1);
		} 
}
