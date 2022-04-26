package com.bilgeadam.boost.lesson007;

import java.util.Scanner;

public class SumAge {

	public static void main(String[] args) {
		
		double a1, a2, a3;
		
		Scanner o1 = new Scanner(System.in);
		
		System.out.println("Please enter first age");
		a1 = o1.nextInt();
		
		System.out.println("Please enter second age");
		a2 = o1.nextInt();
	
		System.out.println("Sum Age");
		a3 = (a1 + a2)/2;
		
		System.out.println(a3);
				
	}

}
