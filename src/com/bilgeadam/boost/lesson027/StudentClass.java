package com.bilgeadam.boost.lesson027;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
	String code;
	String name;
	String subject;
	
	List<Person> students;

	
	public StudentClass(String code, String name, String subject) {
		super();
		this.code = code;
		this.name = name;
		this.subject = subject;
		this.students = new ArrayList<Person>();
	}
	
	public void addStudent(Person person) {
		this.students.add(person);
	}

	@Override
	public String toString() {
		return "StudentClass [code=" + this.code + ", name=" + this.name + ", subject=" + this.subject + ", students="
				+ this.students + "]";
	}

}
