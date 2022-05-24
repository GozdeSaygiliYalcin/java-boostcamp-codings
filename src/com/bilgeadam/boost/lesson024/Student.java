package com.bilgeadam.boost.lesson024;

import java.time.LocalDate;

public class Student implements Comparable<Student>{
	

	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;

	public Student(int id, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}


	public int getId() {
		return this.id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return this.firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return this.lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getBirthDate() {
		return this.birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return "Student [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName
				+ ", birthDate=" + this.birthDate + "]";
	}


	@Override
	public int compareTo(Student otherStudent) {
//		
//		if(this.id<otherStudent.id) {
//			return -1;
//		} else if (otherStudent.id<otherStudent.id) {
//			return 1;
//		}
//		return 0;
		
//		return this.id > otherStudent.id ? 1 :(this.id < otherStudent.id ? -1:0); //more short way to write this code
		
//		return Integer.compare(this.id, otherStudent.id);
		
		
		//The sorting according to the last name
		return this.lastName.compareTo(otherStudent.lastName);
	}
	
	

}
