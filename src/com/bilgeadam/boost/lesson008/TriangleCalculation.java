package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class TriangleCalculation {

	public static void main(String[] args) {
	
		double a1, a2, a3;
		double k1, k2, k3 = 0;
		int tot = 180;
		
		
		Scanner o1 = new Scanner(System.in);
		
		System.out.println("Enter the first angle");
		a1 = o1.nextDouble();
		
		System.out.println("Enter the second angle");
		a2 = o1.nextDouble();

		
		System.out.println("Enter the first length");
		k1 = o1.nextDouble();
		
		System.out.println("Enter the second length");
		k2 = o1.nextDouble();
		
		double temp = (k1*k1) + (k2*k2) - (2*k1*k2* (Math.cos(k3)));
		
	
		System.out.println("third length is=");
		System.out.println(Math.pow(temp, 0.5));
		
		k3 = Math.sqrt(temp);
		
		System.out.println("third angle is=");
		System.out.println(tot-(a1+a2));
		
	}

}
