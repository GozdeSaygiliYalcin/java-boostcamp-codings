package com.bilgeadam.boost.lesson019.grocery.person;

import java.time.LocalDate;

public class Customer extends Person {

	private static int customerCounter;
	private boolean isClose;
	private String favoriteProduct;

	
	
	public Customer(String name, LocalDate birthDate) {
		super(name, birthDate);
	
	}

	@Override
	public String toString() {
		return "Customer [isClose=" + this.isClose + ", favoriteProduct=" + this.favoriteProduct + "]";
	}

	@Override
	public String generateID() {
		// TODO Auto-generated method stub
		return "CST- " + ++customerCounter;
	}
}
