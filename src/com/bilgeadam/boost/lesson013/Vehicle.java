package com.bilgeadam.boost.lesson013;

public class Vehicle {
	
	private String label;
	private String color;
	private int maxSpeed;
	private boolean automaticGear;
	
	public boolean isAutomaticGear() {
		return automaticGear;
	}
	public void setAutomaticGear(boolean automaticGear) {
		this.automaticGear = automaticGear;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String toString() {
		return label +" "+ color+ " " +maxSpeed+ " " +automaticGear;
	
}
}
