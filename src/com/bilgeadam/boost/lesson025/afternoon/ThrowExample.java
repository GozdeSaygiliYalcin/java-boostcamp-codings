package com.bilgeadam.boost.lesson025.afternoon;

public class ThrowExample {
	
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied. You must be at least 18 years old");
			
		} else {
			System.out.println("Access granted.");
		}
			
	}

	public static void main(String[] args) {
		
	//	checkAge(34);
		
		checkAge(12);

	}

}
