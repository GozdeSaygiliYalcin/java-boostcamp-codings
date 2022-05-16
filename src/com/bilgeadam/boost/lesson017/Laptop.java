package com.bilgeadam.boost.lesson017;

public class Laptop extends Computer {

	private int batteryCapacity;
	private String color;
	
	void stateOfCharge(int batteryCapacity) {
		
		if(batteryCapacity<20) {
			
			System.out.println(getBrand() + "low battery: "+ batteryCapacity);
		} else {
			System.out.println(getBrand() + "battery status: " + batteryCapacity);
		}
	}
	
	

	@Override
	void conncectWeb() {
		System.out.println(getBrand() + " brand name is connected to web");
	}



	public int getBatteryCapacity() {
		return this.batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
