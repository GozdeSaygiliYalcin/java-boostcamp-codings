package com.bilgeadam.boost.lesson034.marathon2;

import java.time.LocalDate;

public abstract class Person {
	
	private String firstName; //must
	private String middleName; //optional
	private String lastName; //must
	private String gender; //optional
	private boolean isMarried;//optional
	private LocalDate birthDate;//optional
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	
	}
	
	@Override
	public String toString() { //we created full name with middle name and without middle name	
		return "Person [Name=" + this.getFullName() + ", gender=" + this.gender
				+ ", isMarried=" + this.isMarried + ", birthDate=" + this.birthDate + "]";
	}

	private String getFullName() {
		return this.middleName == null ? this.firstName + " " + this.lastName : 
										this.firstName + " " + this.middleName + " "+ this.lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getGender() {
		return this.gender;
	}

	public boolean isMarried() {
		return this.isMarried;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}
	
	
	

}
