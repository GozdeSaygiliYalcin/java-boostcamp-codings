package com.bilgeadam.boost.lesson027;

import java.time.LocalDate;

public class Person {
	
	int id;
	String name;
	LocalDate birthdate;
	
	public Person(int id, String name, LocalDate birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}

}
