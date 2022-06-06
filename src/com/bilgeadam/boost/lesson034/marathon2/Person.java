package com.bilgeadam.boost.lesson034.marathon2;

import java.time.LocalDate;

public abstract class Person {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private boolean isMarried;
	private LocalDate birthDate;
	
	public Person(String firstName, String lastName, String gender, boolean isMarried, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.isMarried = isMarried;
		this.birthDate = birthDate;
	}
	
	public Person(String firstName, String middleName, String lastName, String gender, boolean isMarried, LocalDate birthDate) {
		this(firstName, lastName, gender, isMarried, birthDate);
		this.middleName = middleName;
	}

	@Override
	public String toString() { //we created full name with middle name and without middle name
		String fullName = getFullName();
		
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
