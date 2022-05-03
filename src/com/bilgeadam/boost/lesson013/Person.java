package com.bilgeadam.boost.lesson013;

public class Person {
	private static int numOffPersons=0;  //class variables

	//Instance variables
	
	
	private String firstName;
	private String lastName;
	private int age;
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		Person person =new Person();
		System.out.println(person.toString());
		
		person.age =12;
		person.firstName = "Gozde";
		person.lastName = "Saygili";
		Person.numOffPersons++;
		
		int daysLived =person.age*365; //local variable
		
		System.out.println("Number of persons created "+Person.numOffPersons);
		System.out.println();

	}
	private String getFullName() {
	String fullName = this.firstName + this.lastName;
	return fullName;
}
}
