package com.bilgeadam.boost.lesson017;

public class Computer {
	
	private String brand;
	private int ramSize;
	private double screenSize;
	
	
	public Computer(int ramSize, double screenSize) {
	
		this.ramSize = ramSize;
		this.screenSize = screenSize;
	}

	public Computer() {
		
	}
	Computer(String brand, int ramSize, double screenSize) {
		super();
		this.brand = brand;
		this.ramSize = ramSize;
		this.screenSize = screenSize;
	
	}
	void conncectWeb() {
		
		System.out.println(brand + " is connected to the web");
	}
	
	void runProgram(String program) {
		
		System.out.println(brand + "worked to the "+ program );
	}

	
	//Getters and Setters are created
	public void setBrand(String brand) {
		
		this.brand = brand;
	}

	public void setRamSize(int ramSize) {
		
		this.ramSize = ramSize;
	}

	public void setScreenSize(double screenSize) {
		
		this.screenSize = screenSize;
	}

	public String getBrand() {
		
		return this.brand;
	}

	public int getRamSize() {
		
		return this.ramSize;
	}

	public double getScreenSize() {
		
		return this.screenSize;
	}

	public void showFeatures() {
		
		System.out.println("Computer [brand=" + this.brand + ", ramSize=" + this.ramSize + ", screenSize=" + this.screenSize + "]"); 
	}
}


