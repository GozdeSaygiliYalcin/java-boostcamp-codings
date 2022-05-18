package com.bilgeadam.boost.lesson023;

public class Student {
	
	private int id;
	private String name;
	private int grade;
	
	public Student(int id, String name, int grade) { //constructor method
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + this.id + ", name=" + this.name + ", grade=" + this.grade + "]";
	}

}
