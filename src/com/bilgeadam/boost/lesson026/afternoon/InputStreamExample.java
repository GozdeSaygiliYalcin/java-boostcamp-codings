package com.bilgeadam.boost.lesson026.afternoon;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		
		
		byte [] array = new byte[100];
		
		try {
			InputStream input = new FileInputStream("output.txt");
			System.out.println("Available bytes in the files: " + input.available());
			byte [] array2 = new byte[input.available()];	
			input.skip(5);
			System.out.println("Input stream after skipping 5 bytes: ");
			
			input.read(array2);
			System.out.println("Data read from the file: ");
			
			//Converting byte array into String
			String data = new String(array2);
			System.out.println(data);
			
			input.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
