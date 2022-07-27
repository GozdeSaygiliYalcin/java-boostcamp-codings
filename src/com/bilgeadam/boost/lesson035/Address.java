package com.bilgeadam.boost.lesson035;

public class Address {
	
	private String street;
	private int doorNumber;
	private int postCode;
	private String city;
	private String country;

	
	public Address(String street, int doorNumber, int postCode, String city, String country) {
		super();
		this.street = street;
		this.doorNumber = doorNumber;
		this.postCode = postCode;
		this.city = city;
		this.country = country;
	}


	public String getStreet() {
		return this.street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getDoorNumber() {
		return this.doorNumber;
	}


	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}


	public int getPostCode() {
		return this.postCode;
	}


	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}


	public String getCity() {
		return this.city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return this.country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [street=" + this.street + ", doorNumber=" + this.doorNumber + ", postCode=" + this.postCode
				+ ", city=" + this.city + ", country=" + this.country + "]";
	}

	
}
