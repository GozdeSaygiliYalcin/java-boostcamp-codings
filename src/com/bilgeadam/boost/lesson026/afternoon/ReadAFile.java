package com.bilgeadam.boost.lesson026.afternoon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {
		char[] array = new char[100];
		
		try {
			FileReader input =new FileReader("output.txt");
			
			input.read(array);
			System.out.println(array);
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
