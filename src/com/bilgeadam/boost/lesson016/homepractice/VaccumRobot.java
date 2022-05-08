package com.bilgeadam.boost.lesson016.homepractice;

public class VaccumRobot {
	
	
	private int batteryCapacity = 100;
	int distanceTravelledForward;
	int distanceTravelledRight;
	private boolean checkMap;
	int checkDust=0;
	
		
		private void remainingBattery() {
		System.out.println("Remaining Battery: "+batteryCapacity);
		
			if(batteryCapacity<=20) {
			System.out.println("Battery is low! Returning to the charging unit!");
			}
			
		}
		
		void charge() { //this is information about charge capacity.

			if(batteryCapacity>=100) {
				System.out.println("Battery Full!. Cleaning is remaining");
			}else {
				batteryCapacity++;
				remainingBattery();
			}
		}
		
		void map() { //this method provides to check map.
			
			if(checkMap == false) {
				
				} else if(checkMap == true)
				distanceTravelledRight++;
					
		}
		void dustStatus() {
				if(checkDust>=10) {
					System.err.println("Please check the dust bag. It is full");
					checkDust =checkDust-10;
				} else
					map();
				
		}
		
		void moveOneMeterForward() {
			if(batteryCapacity<=0) {
				remainingBattery();
			}else {
				distanceTravelledForward++;
				batteryCapacity--;
				checkDust++;
				remainingBattery();
				dustStatus();
			}
		}
		
		void moveOneMeterBackward() {
			if(batteryCapacity<=0) {
				remainingBattery();
				
			}else {
				distanceTravelledForward--;
				batteryCapacity--;
				checkDust++;
				remainingBattery();
				dustStatus();
			}
		}
		
		void moveOneMeterRight() {
			if(batteryCapacity<=0) {
				remainingBattery();
				
			}else {
				distanceTravelledRight++;
				batteryCapacity--;
				checkDust++;
				remainingBattery();
				dustStatus();
			}
		}
		
		void moveOneMeterLeft() {
			if(batteryCapacity<=0) {
				remainingBattery();
				
			}else {
				distanceTravelledRight--;
				batteryCapacity--;
				checkDust++;
				remainingBattery();
				dustStatus();
			}
		}
		
		void cleanRoomHall() {
			
				moveOneMeterBackward();
				moveOneMeterForward();
				moveOneMeterLeft();
				moveOneMeterRight();
				moveOneMeterBackward();
				moveOneMeterForward();
				moveOneMeterLeft();
				moveOneMeterRight();
			
		}
		
		void cleanRoomKitchen() {
				
				moveOneMeterBackward();
				moveOneMeterForward();
			
		}
		
		void cleanRoomBedRoom() {
			
				moveOneMeterBackward();
				moveOneMeterForward();
				moveOneMeterLeft();
				moveOneMeterRight();
		}

		void cleanRoomBath() {
			
				moveOneMeterBackward();
				moveOneMeterRight();
		}

		private void endVaccumJob() { //why this method is not coming to the manager class?
				System.out.println("Clean is completed succesfully");

		}
}