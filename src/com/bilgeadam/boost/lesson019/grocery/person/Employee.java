package com.bilgeadam.boost.lesson019.grocery.person;

import java.time.LocalDate;

public class Employee extends Person {
	
	private static int employeeCounter;
	private double salary;
	private LocalDate startDate;
	private String position;
	
	


	public Employee(String name, LocalDate birthDate, double salary, LocalDate startDate, String position) {
		super(name, birthDate);
		this.salary = salary;
		this.startDate = startDate;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + this.salary + ", startDate=" + this.startDate + ", position=" + this.position
				+ "]";
	}
	
	@Override
	public String generateID() {
		String num = String.format("%03d", ++employeeCounter);
		return "emp-" + ++employeeCounter;
	}

	public static int getEmployeeCounter() {
		return employeeCounter;
	}

	public static void setEmployeeCounter(int employeeCounter) {
		Employee.employeeCounter = employeeCounter;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
}

