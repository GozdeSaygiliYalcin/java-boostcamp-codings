package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model;

public class StudentMarriageExceptions extends Exception {

private static final long serialVersionUID = 1L;
	
	Student student;

	public StudentMarriageExceptions(String marriage) {
		super(marriage);
	}
}
