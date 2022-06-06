package com.bilgeadam.boost.lesson032.afternoon;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t=input.nextInt();
	    for(int i=0;i<t;i++){
       
	    	int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int c = a;
    
        	for(int j=0;j<n;j++){
        		
            	if(a <=50 && b <= 50 && a >= 0 && b >= 0) {
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            	}
            }
            System.out.println();
        }
        input.close();  
	}

}
