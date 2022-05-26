package com.bilgeadam.boost.lesson027;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializationExample {

	public static void main(String[] args) {
		// This is an example that shows basic serialization example
		
		StudentClass clasz = new StudentClass("java", "x", "y");
		
		
		clasz.addStudent(new Person(1, "boncuk", LocalDate.of(1989, 9, 18)));
		clasz.addStudent(new Person(2, "boncuk2", LocalDate.of(1986, 9, 18)));
		clasz.addStudent(new Person(3, "boncuk3", LocalDate.of(1982, 9, 18)));
		
		System.out.println(clasz);
		
		
		try(FileOutputStream fos = new FileOutputStream("/Users/gozde/Desktop/Coding/01-BilgeAdam_Boost/FileExample/students.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(clasz);
				oos.flush();
				System.out.println("object is written");
			
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
;			
		}
	}

}
