package com.bilgeadam.boost.lesson025.afternoon;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		
		
		try {
			
		int myInt = Integer.parseInt("Boncuk");
		// a code that can be occured any error
		return;
		
		} catch(NumberFormatException | NullPointerException e) {
		//any code in case any error 
			System.err.println("You are trying to convert a text, please check again! ");
			
		} finally {
			System.out.println("Finally block");
		}
		
	}

}
