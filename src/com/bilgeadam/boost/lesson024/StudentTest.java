package com.bilgeadam.boost.lesson024;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student(123, "Gozde", "Yalcin", LocalDate.of(1989, 9, 18));
		Student stu2 = new Student(125, "Efdal", "Yalcin", LocalDate.of(1986, 6, 3));
		Student stu3 = new Student(155, "Boncuk", "Yalcin", LocalDate.of(2020, 3, 9));
		
		List<Student> students = new ArrayList<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		
		System.out.println(Arrays.toString(students.toArray()));
		
		//in order to sort students
		
//		System.out.println((stu1.compareTo(stu2)));
//		System.out.println();
		
		
		
	}

}
