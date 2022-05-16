package com.bilgeadam.boost.lesson017;

public class Vehicle {
	
	private String brand;
	private String name;
	private String color;
	private String engine;
	private int speed;
	
	
	public Vehicle(String brand, String name, String color) {
		this.brand =brand;
		this.name = name;
		this.color = color;
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return this.brand;
		
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getEngine() {
		return this.engine;
	}
	
	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int i) {
		
		this.speed=i;
	}
	
	public int Calculate(int a, int b, int c) {
	int	total= a*b*c;
		return 0;
		
		
	}

	
}
