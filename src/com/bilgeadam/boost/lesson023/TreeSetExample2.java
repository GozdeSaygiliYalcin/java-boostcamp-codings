package com.bilgeadam.boost.lesson023;

import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		
		TreeSet<Student> students =new TreeSet<Student>(new OrderNotesComparator());
		
		Student st1 = new Student(102, "boncuk", 100);
		
		students.add(st1);
		students.add(new Student(103, "boncuk3", 75));
		students.add(new Student(101, "boncuk2", 20));
		
		for (Student student : students) {
			System.out.println(student);
			
		}
	}

}
