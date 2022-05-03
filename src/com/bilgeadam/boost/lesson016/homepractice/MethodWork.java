package com.bilgeadam.boost.lesson016.homepractice;

public class MethodWork {
	
	static int power (int base, int exp) {  //This is a method which has attributes static. 
		int result = 1;
		for(int i = 1; i<=exp; i++) {
			result *=base;
		}
		return result;
	}

	public static void main(String[] args) {
		
	
		System.out.println(power(2, 3));   // int base = 2 int exp =3
		System.out.println(power(12, 4));  
		System.out.println(power(2, 5));
	}

}
