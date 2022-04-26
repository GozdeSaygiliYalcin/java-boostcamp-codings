package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		
	int i, row;
		
		Scanner o1 = new Scanner(System.in);
		System.out.println("please enter a number");
	
		if(o1.hasNextInt())  {
			row = o1.nextInt();
		
		for (i=0; i<row; i++) {
				for (int j= 0; j<= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			} else {
				o1.close();
				System.out.println("error");	
			}
	
	}
}
