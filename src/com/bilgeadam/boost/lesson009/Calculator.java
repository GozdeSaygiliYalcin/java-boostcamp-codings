package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		int n1, n2;
		char process;
		int result;
		
		Scanner o1 = new Scanner(System.in);
		System.out.println("enter first number");
		n1 = o1.nextInt();
		
		
		System.out.println("enter second number");
		n2 =o1.nextInt();
		
		System.out.println("enter an operator +, -, *, /");
		process = o1.next().charAt(0); //metnin ilk karakterini alıyor
		
		
		switch(process) {
		case '+':
			result = (n1+n2);
			break;
		case '-':
			result = (n1-n2);
			break;
		case '*':
			result = (n1*n2);
			break;
		case '/':
			result = (n1/n2);
		
		default:
			System.out.println("error");
			return;
	}
		o1.close();
		System.out.println("the result is" + " " + result);
}

	
	}
