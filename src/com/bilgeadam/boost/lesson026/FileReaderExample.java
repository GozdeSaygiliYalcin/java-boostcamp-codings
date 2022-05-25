package com.bilgeadam.boost.lesson026;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		File myFile =new File("letter.txt");
		
		if(!myFile.exists()) {
			System.err.println("file not exist");
			System.exit(10);
		}
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(myFile);
			BufferedReader reader =new BufferedReader(fileReader);
			while(true) {
				String line = reader.readLine();
				if(line == null) {
					break;
				}
				else {
					System.out.println("==>" + line);
				}
			}
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			
			ex.printStackTrace();
		}
		finally {
			if(fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException ex) {
					ex.printStackTrace();
					}
				}
			if(reader !=null) {
				try {
					reader.close();
				}
				catch(IOException ex) {
				ex.printStackTrace();
				}
			}
	
		}

	}
}
