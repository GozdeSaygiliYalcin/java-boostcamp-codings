package com.bilgeadam.boost.lesson012;

import java.util.Scanner;

public class FindMinimum {
	
	public static void main(String[] args) {
		Scanner o1 = new Scanner(System.in);
		int n1 = o1.nextInt();
		int n2 = o1.nextInt();
		o1.close();		
		System.out.println(minFunction(n1,n2));
		
	}
	
	public static int minFunction(int n1, int n2) {
	int min;
	if(n1>n2)
		min=n2;
	else
		min = n1;
	return min;
}
}