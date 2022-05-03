package com.bilgeadam.boost.lesson015;

public class Laptop {
	
	private String brandName;
	private int batteryCapacity=100;
	int ramSize;
	String screenSize;
	
	void connectWeb() {
		System.out.println(brandName +" is connected");
	}
	void showFeatures() {
		System.out.println("Brand is: "+brandName);
		
	}
	void remainingBattery() {
			System.out.println(batteryCapacity);
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	
	
}
