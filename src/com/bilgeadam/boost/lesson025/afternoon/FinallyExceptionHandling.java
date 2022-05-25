package com.bilgeadam.boost.lesson025.afternoon;

public class FinallyExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int data = 25/0;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println("error is found");
		} finally {
			System.out.println("finally block");
		}
		

	}

}
