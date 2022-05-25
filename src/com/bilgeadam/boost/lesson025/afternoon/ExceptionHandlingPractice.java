package com.bilgeadam.boost.lesson025.afternoon;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		
		
		try {
			
			int divideByZero = 5/0;
		} 
		catch(ArithmeticException e) {
			
			System.err.println("the divider has to be different from 0" + e.getMessage());
			

		}finally {
			System.out.println("bye");
		}

	}

}
