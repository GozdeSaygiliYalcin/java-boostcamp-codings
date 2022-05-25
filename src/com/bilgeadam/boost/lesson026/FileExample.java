package com.bilgeadam.boost.lesson026;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileExample {

	public static void main(String[] args) {
		// This code belong to I/O and File exercises
		
		File myFile = new File("/Users/gozde/Desktop/Coding/01-BilgeAdam_Boost/FileExample");
		
		if(myFile.isFile()) {
			System.out.println("a file");

		}
		if(myFile.isDirectory()) {
			System.out.println("a folder");
			String[] fileNames = myFile.list();
			for(String fileName :fileNames) {
				System.out.println(fileName);
				File file = new File(myFile, fileName);
				if(file.isFile()) {
					System.out.println("file name: " +file.getName());
					System.out.println("file path: " + file.getAbsolutePath());
					System.out.println("free space: " + file.getFreeSpace());
					System.out.println(file.canExecute() ? "execute" : "not executable");
					System.out.println(file.isHidden() ? "private" : "not private");
					System.out.println(file.canRead() ? "readable" : "not readable");
					System.out.println("\n=============================================");
					long lastModified = file.lastModified();
					LocalDateTime lastModifiedTime =Instant.ofEpochMilli(lastModified).atZone(ZoneId.systemDefault()).toLocalDateTime();
					System.out.println("last modified time: " + lastModifiedTime);
					System.out.println("\n=============================================");
				}
			}
			File newFile = new File("/Users/gozde/Desktop/Coding/01-BilgeAdam_Boost/FileExample/thirdFile.txt");
			if(newFile.exists())  {
				
				System.err.println("file already exists");
			}
			else {
				boolean success = false;
				try {
					success = newFile.createNewFile();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				if(success) {
					System.out.println("file is created");
				}
				else {
					System.out.println("file already exists, cannot be created again");
				}
			}

		}
	}
}
