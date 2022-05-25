package com.bilgeadam.boost.lesson025;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// This is an example that shows exception
		
		Scanner input = new Scanner(System.in);
		
		while(true)  {
			try {
				
			int i = input.nextInt();
			System.out.println(i);
			
			readOnlyStrings(input);
			break;
			
			}
			catch(Exception e) {
				System.err.println("Mismatch input type");
				System.out.println(e.getMessage());
			//	e.printStackTrace();
			} 
			finally {
				input.nextLine();
			}
		}
		input.close();
	}

	private static void readOnlyStrings(Scanner input) throws Exception {
		System.out.println();
		System.out.println("please enter a character except a number: ");
		String str =input.nextLine();
		char[]chars = str.toCharArray();
		for (char c : chars) {
			
			if(c>='0' && c<='9') {
				throw new Exception("only chars which are not number can be entered");
				
			}
			
		}
		
	}

}
