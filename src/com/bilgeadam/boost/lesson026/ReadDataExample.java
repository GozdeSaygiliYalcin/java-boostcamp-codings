package com.bilgeadam.boost.lesson026;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ReadDataExample {

	public static void main(String[] args) {
		File inputFile =new File("/Users/gozde/Desktop/Coding/01-BilgeAdam_Boost/FileExample/measurement.dat");
		
		try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFile)))) {
			
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
		
			
//			while(true) {
//				Double value = in.readDouble();
//				System.out.println(value);
		//	}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
