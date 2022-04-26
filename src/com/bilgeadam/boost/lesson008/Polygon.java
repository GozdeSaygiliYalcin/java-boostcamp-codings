package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {

		int n;
		double s;
		
		Scanner o1 = new Scanner(System.in);
		
		System.out.println("Enter the side number");
		n = o1.nextInt();
		
		System.out.println("Enter the side length");
		s = o1.nextDouble();
		

		double area = (n*s*s)/(4*Math.tan(3.14/n));
		
		System.out.println("Area is" + " "+ area +" "+"metrekare");

	}

}
