package com.bilgeadam.boost.lesson035;

public class House {
	
	private int area;
	private int numOfRooms;
	private int numOfFloor;
	private int numOffBalconies;
	private int areaOfFrontGarden;
	private int areaOfBackGarden;
	private int numOffWindow;
	private int numOfOutdoors;
	private int areaOfTerrace;
	private Address address;
	
	public House(HouseBuilder houseBuilder) {
		
		this.area = houseBuilder.area;
		this.address = houseBuilder.address;
		this.numOfFloor = houseBuilder.numOfFloor;
		this.numOffBalconies = houseBuilder.numOffBalconies;
		this.areaOfFrontGarden = houseBuilder.areaOfFrontGarden;
		this.areaOfBackGarden = houseBuilder.areaOfBackGarden;
		this.numOffWindow = houseBuilder.numOffWindow;
		this.numOfOutdoors = houseBuilder.numOfOutdoors;
		this.areaOfTerrace = houseBuilder.areaOfTerrace;
		this.address = houseBuilder.address;
		
		
	}

	@Override
	public String toString() {
		return "House [area=" + this.area + ", numOfRooms=" + this.numOfRooms + ", numOfFloor=" + this.numOfFloor
				+ ", numOffBalconies=" + this.numOffBalconies + ", areaOfFrontGarden=" + this.areaOfFrontGarden
				+ ", areaOfBackGarden=" + this.areaOfBackGarden + ", numOffWindow=" + this.numOffWindow
				+ ", numOfOutdoors=" + this.numOfOutdoors + ", areaOfTerrace=" + this.areaOfTerrace + ", address="
				+ this.address + "]";
	}
	
	public static class HouseBuilder {

		private int area;
		private int numOfRooms;
		private int numOfFloor;
		private int numOffBalconies;
		private int areaOfFrontGarden;
		private int areaOfBackGarden;
		private int numOffWindow;
		private int numOfOutdoors;
		private int areaOfTerrace;
		private Address address;
		
		
		public HouseBuilder(int area, int numOfRooms, int numOfFloor, int numOffWindow, Address address) { // must have olanları burada belirttik.
			super();
			this.area = area;
			this.numOfRooms = numOfRooms;
			this.numOfFloor = numOfFloor;
			this.numOffWindow = numOffWindow;
			this.address = address;
		}
		
		public HouseBuilder numOfBalconies(int numOffBalconies) {
			this.numOffBalconies = numOffBalconies;
			return this;
		}

		public HouseBuilder areafFrontGarden(int areaOfFrontGarden) {
			this.areaOfFrontGarden = areaOfFrontGarden;
			return this;
		}
		public HouseBuilder areaOfBackGarden(int areaOfFrontGarden) {
			this.areaOfFrontGarden = areaOfFrontGarden;
			return this;
		}
		
		public HouseBuilder areaOfTerrace(int areaOfTerrace) {
			this.areaOfTerrace = areaOfTerrace;
			return this;
		}
		
		public House build() {
			House house = new House(this);
			return house;
		}
	}
}


