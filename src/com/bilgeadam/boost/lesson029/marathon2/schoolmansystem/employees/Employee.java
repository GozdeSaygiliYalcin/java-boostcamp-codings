package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees;

import java.time.LocalDate;

import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Gender;
import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Person;

public abstract class Employee extends Person {
	
	protected String id;
	protected double salary;
	
	public Employee(String firstName, String middleName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, long homeNumber, long mobileNumber,
			String id, double salary) {
		super(firstName, middleName, lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber);
		this.id = id;
		this.salary = salary;
	}
	
	public Employee(String firstName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, long homeNumber, long mobileNumber,
			String id, double salary) {
		super(firstName, lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber);
		this.id = id;
		this.salary = salary;
	}

	public abstract double getSalary();

	public String getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", salary=" + this.salary + ", =" + super.toString() + "]";
	}

}
