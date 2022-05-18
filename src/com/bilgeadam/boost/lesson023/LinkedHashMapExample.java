package com.bilgeadam.boost.lesson023;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// This is an LinkedHashMap Example that contains basic methods.
		
		LinkedHashMap<Integer, Student> students = new LinkedHashMap<Integer, Student>();
		
		Student st1 = new Student(102, "boncuk", 100);
		
		students.put(1, st1);
		students.put(2, new Student(103, "boncuk3", 75));
		students.put(3, new Student(101, "boncuk2", 20));
		
		for (Student student : students.values()) {
			System.out.println(student.getName());
			
		}
		Student st2 = students.remove(1);
		System.out.println("removed value is: " + st2);
		
		boolean result = students.remove(102, st1);
		System.out.println("Is the entry 102 removed? " +result);
		System.out.println("The updated LinkedHashMap: " + students);
		

	}

}
