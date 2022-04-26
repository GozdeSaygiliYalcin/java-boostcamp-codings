package com.bilgeadam.boost.lesson010;

import java.util.Scanner;

public class ObebOkek {

	public static void main(String[] args) {
	
	int x,y,z;
	int obeb=0;
	int okek = 0;
	
		
		Scanner o1 = new Scanner(System.in);
		System.out.println("Please enter three numbers");
		x = o1.nextInt();
		y = o1.nextInt();
		z = o1.nextInt();
		
		for (int i=1; i<=x && i<=y && i<=z; i++) {
			if(x%i == 0 && y%i == 0 && z%i == 0) 
			obeb = i;
			okek= (x*y*z)/(obeb*obeb);
			
		}
		o1.close();
		System.out.println("obeb" +" " + obeb+ " "+"and okek" +" " +okek);
	}
	
}
