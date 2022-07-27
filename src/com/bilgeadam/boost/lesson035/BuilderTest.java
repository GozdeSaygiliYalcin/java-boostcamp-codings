package com.bilgeadam.boost.lesson035;

import com.bilgeadam.boost.lesson035.House.HouseBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		

		HouseBuilder house = new House.HouseBuilder(200, 4, 2, 0, null)
				.areafFrontGarden(30)
				.areaOfTerrace(50)
				.numOfBalconies(3)
				.areaOfBackGarden(45);
		
		
		System.out.println(house);
		
		HouseBuilder house2 = new HouseBuilder(400, 4, 2, 0, null)
				.areafFrontGarden(80)
				.numOfBalconies(6);
		
		System.out.println(house2);

	}

}
