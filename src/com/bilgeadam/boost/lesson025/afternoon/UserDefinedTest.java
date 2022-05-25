package com.bilgeadam.boost.lesson025.afternoon;

public class UserDefinedTest {

	public static void main(String[] args) throws Exception {
		UserDefinedException p1 = new UserDefinedException(23, 'w');
		UserDefinedException p2 = new UserDefinedException(45, 'm');
		
		try {
			
			if(p1.gender == 'm') {
				
			throw new Exception("Access denied");
			
				
			} else {	
				System.out.println("Welcome");
			}

		} catch (Exception e) {
			
			throw new Exception("Access denied");
		}

	}

}
