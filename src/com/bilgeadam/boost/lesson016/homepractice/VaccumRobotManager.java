package com.bilgeadam.boost.lesson016.homepractice;

import java.util.Scanner;

public class VaccumRobotManager {

	public static void main(String[] args) {
		
		VaccumRobot manager = new VaccumRobot();
		
		while(true)  {
		Scanner input = new Scanner(System.in);
		System.out.println("please select the room do you want to clean 1.hall 2.kitchen 3.bedroom 4.bath 5.charge");
		
		int roomSelection;
		roomSelection =input.nextInt();
		
		switch(roomSelection) {
		
		case 1:
			manager.cleanRoomHall();
			break;
		
		case 2:
			manager.cleanRoomKitchen();
			break;
			
		case 3:
			manager.cleanRoomBedRoom();
			break;
			
		case 4:
			manager.cleanRoomBath();
			break;
			
		case 5:
			manager.charge();
			break;
	
		}

	}
}
}

