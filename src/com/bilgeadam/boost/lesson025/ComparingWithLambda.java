package com.bilgeadam.boost.lesson025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bilgeadam.boost.lesson024.Student;

public class ComparingWithLambda {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(123, "Gozde", "Yalcin", LocalDate.of(1989, 9, 18)));
		students.add(new Student(125, "Efdal", "Yalcin", LocalDate.of(1986, 6, 3)));
		students.add(new Student(155, "Boncuk", "Yalcin", LocalDate.of(2020, 3, 9)));
		
		System.out.println("initial order: " + Arrays.toString(students.toArray()));
		

	}

}
