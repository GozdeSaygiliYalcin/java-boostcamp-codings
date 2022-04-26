package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class FaktorielCalculation {

	public static void main(String[] args) {
		Scanner o1 = new Scanner(System.in);
		int input;
		long factor;
		
		while(true) {
			System.out.println("enter a number between 1 and 23 (the end of the program is 23)");
			input = o1.nextInt();
			System.out.println();
			if (input == 99) {
				System.out.println("thanks");
				break;
				
			}
			if (input < 1 || input>23) {
				System.err.println("ERROR! cannot resolve this numbber, please enter again");
				continue;
			}
			factor=1;
			for(int i=1; i<= input; i++) {
				factor = factor*i;
			}
			System.out.println("factoriel of"+" "+ input + " " + "is"+" "+factor);
 		} 
o1.close();
System.out.println("It is done");
	}

}
