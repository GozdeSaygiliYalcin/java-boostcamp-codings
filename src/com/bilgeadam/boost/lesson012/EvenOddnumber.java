package com.bilgeadam.boost.lesson012;

public class EvenOddnumber {

	public static void main(String[] args) {
		
		boolean n = isEven(15);
		System.out.println(n);
	
	}
	public static boolean isEven(int n) {
		if(n%2 == 0)
		return true;
		else
		return false;
		
		
}
}