package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int n, count= 0;
		
			Scanner o1 = new Scanner(System.in);
			System.out.println("please enter a number");
			n = o1.nextInt();
			
			if(n==0 || n==1) {
			System.out.println(n+" is not prıme number");
		
	
			} else {
				for(int i=2; i<n; i++) {
					if(n%i == 0); {
						count++;
					}
					
				}
				if(count ==0) {
					System.out.println(n+ " is prime number");
			} else 
			o1.close();
			System.out.println(n+ " is not prime number");
			
			}
		
		
		}
	}


