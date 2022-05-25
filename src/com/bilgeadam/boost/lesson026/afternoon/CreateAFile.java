package com.bilgeadam.boost.lesson026.afternoon;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
		// I/O
		
		File file =new File("newFile.txt");
		
		try {
			boolean value =file.createNewFile();
			
			if(value) {
				System.out.println("The new file is created");
			}
			else {
				System.out.println("The file already exists");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
