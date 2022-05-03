package com.bilgeadam.boost.lesson015;

public class LaptopManager {

	public static void main(String[] args) {

		Laptop laptop =new Laptop();
			
			laptop.setBrandName("Macbook Air ");
			laptop.setRamSize(16);
			laptop.setScreenSize("14 inch");
			
			laptop.connectWeb();
			laptop.showFeatures();
			laptop.remainingBattery();

	}

}
