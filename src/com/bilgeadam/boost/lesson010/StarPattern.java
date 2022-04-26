package com.bilgeadam.boost.lesson010;

public class StarPattern {

	public static void main(String[] args) {
		
		
		int i =0;
		int row=60;
		
		for (i=-1; i<row; i++) {
			i=i+1;
				for (int j= 0; j<= i; j++) {
					//if(j<=2);
					System.out.print("*");
				}
				System.out.println();
			}	
	}
}
