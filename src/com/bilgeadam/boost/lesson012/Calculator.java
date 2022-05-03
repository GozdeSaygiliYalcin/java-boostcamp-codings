package com.bilgeadam.boost.lesson012;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double a;
		double b ;
		double result;
		Scanner o1 =new Scanner(System.in);
		System.out.print("Please enter first number: ");
		a =o1.nextInt();
		System.out.print("Please enter second number: ");
		b =o1.nextInt();
		
		System.out.print("Please select an operator +, -, *, / : ");
		char operator;
		operator = o1.next().charAt(0);
		
		switch (operator) {
		case '+':
		{
		result = sum(a,b);
		break;
		}
		case '*':
		{
		result = multiply(a,b);
		break;
		}
		case '-':
		{
		result = diff(a,b);
		break;
		}
		case '/':
		{	
		result =divide(a,b);
		break;
		}
		default:
		System.out.println("error");
		return;
		
		}
		o1.close(); {
			System.out.println("The result is" + " " + result); }
	}

	private static double multiply(double a, double b) {
		return a*b;
	}

	private static double divide(double a, double b) {
		return a/b;
	}

	private static double diff(double a, double b) {
		return a-b;
	}

	private static double sum(double a, double b) {
		return a+b;
		
	}
	
}

