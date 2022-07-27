package com.bilgeadam.boost.lesson036.afternoon.builder;

public class Computer {
	
	private String HDD;
	private String RAM;
	
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	
	
	public Computer() {
		super();
		this.HDD = HDD;
		this.RAM = RAM;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	public String getHDD() {
		return this.HDD;
	}
	public void setHDD(String HDD) {
		this.HDD = HDD;
	}
	public String getRAM() {
		return this.RAM;
	}
	public void setRAM(String RAM) {
		this.RAM = RAM;
	}
	public boolean isGraphicsEnabled() {
		return this.isGraphicsEnabled;
	}
	public void setGraphicsEnabled(boolean isGraphicsEnabled) {
		this.isGraphicsEnabled = isGraphicsEnabled;
	}
	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}
	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	
}
