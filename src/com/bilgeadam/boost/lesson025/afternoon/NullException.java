package com.bilgeadam.boost.lesson025.afternoon;

public class NullException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
	
		
		try {
			String s = null;
			System.out.println(s.length());
			
		} catch (NullPointerException e) {
			System.out.println("String cannot be null: " + e.getMessage());
			
		} finally {
			System.out.println("Bye");
		}
		
	}

}
