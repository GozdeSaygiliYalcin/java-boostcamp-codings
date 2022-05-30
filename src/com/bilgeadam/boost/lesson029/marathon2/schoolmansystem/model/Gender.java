package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model;

public enum Gender {
	
	MALE(1), FEMALE(2), NO_INFO(3);
	
	int gender;

	private Gender(int gender) {
		this.gender = gender;
	}
}
