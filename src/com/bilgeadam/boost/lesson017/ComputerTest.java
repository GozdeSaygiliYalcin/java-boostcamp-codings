package com.bilgeadam.boost.lesson017;

public class ComputerTest {

	public static void main(String[] args) {
		

		Computer computer = new Computer();
		computer.setBrand("Apple");
		computer.setRamSize(16);
		computer.setScreenSize(13.2);
		computer.showFeatures();
		
		Computer computer2 =new Computer("x", 32, 13);
		computer2.setBrand("Dell");
		computer2.showFeatures();
		computer2.conncectWeb();
		
		Laptop laptop = new Laptop();
		laptop.setBrand("HP");
		laptop.setRamSize(16);
		laptop.setScreenSize(14);
		laptop.setColor("purple");
		laptop.setBatteryCapacity(85);
		laptop.showFeatures();
		laptop.conncectWeb();
		
		Desktop desktop = new Desktop();
		desktop.setBrand("lenova");
		desktop.setRamSize(16);
		
		
		Computer laptop2 =new Laptop();
		
		
	}
	

}
