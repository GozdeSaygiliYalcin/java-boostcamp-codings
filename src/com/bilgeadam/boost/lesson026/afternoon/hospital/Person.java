package com.bilgeadam.boost.lesson026.afternoon.hospital;

public abstract class Person implements WageIncrease{
	
	private String firstName;
	private String lastName;
	private String job;
	private int age;
	double salary;
	
	public Person(String firstName, String lastName, String job, int age, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.age = age;
		this.salary = salary;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getJob() {
		return this.job;
	}
	public int getAge() {
		return this.age;
	}
	public double getSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + this.firstName + ", lastName=" + this.lastName + ", job=" + this.job + ", age="
				+ this.age + ", salary=" + this.salary + "]";
	}
	
	
	
	
}
