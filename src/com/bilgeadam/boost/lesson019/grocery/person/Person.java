package com.bilgeadam.boost.lesson019.grocery.person;

import java.time.LocalDate;

public abstract class Person {

	private String name;
	private String adress;
	private LocalDate birthDate;
	private String idNumber;
	
	
	public Person(String name, LocalDate birthDate)  {
		this.name = name;
		this.birthDate = birthDate;
		this.idNumber =this.generateID();
		
	}
	public abstract String generateID();	

	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return this.adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public LocalDate getBirthDate() {
		return this.birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Person [name=" + this.name + ", adress=" + this.adress + ", birthDate=" + this.birthDate + "]";
	}
	
	
}
