package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class FibonacciCalculation {

	public static void main(String[] args) {
		// fibonacci series 
		// 1 1 2 3 5 8 13 21 34 ...
		// n1 n2 n3 
		//   n1 n2 n3
		//     n1 n2 n3
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		int input;
		

		Scanner o1 = new Scanner(System.in);
		System.out.println("This is Fibonacci sequence. How many sequence length do you want to print?");
		input =o1.nextInt();
		
	
		for(int i= 0; i <= input; i++) {
			
			n3 = n1+n2;
			n1=n2;
			n2 = n3;
			System.out.print(n1 +",");	
		}
		
		o1.close();
	}

}
