package com.bilgeadam.boost.lesson024.afternoon;

public class Person {
	
	String firstName;
	String lastName;
	String gender;
	int age;

	public Person(String firstName, String lastName, String gender, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	public void talk() {
		 System.out.println("Hi, I am " + firstName);
	 }
	@Override
	public String toString() {
		return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName + ", gender=" + this.gender
				+ ", age=" + this.age + "]";
	}
}
