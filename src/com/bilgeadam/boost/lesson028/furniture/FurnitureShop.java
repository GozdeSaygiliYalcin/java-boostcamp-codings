package com.bilgeadam.boost.lesson028.furniture;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
	
	private List<Furniture> furnitures;
	
	

	public FurnitureShop() {
		super();
		this.furnitures = new ArrayList<>();
	}

	public static void main(String[] args) {
	
		FurnitureShop fs = new FurnitureShop();
		fs.InitFurnitureList();
		fs.listFurnitures();
		
	}

	public void Vernish() {
	
	}
	
	private void listFurnitures() {

		System.out.println(" Furniture List ");
		this.furnitures.stream()
				.forEach(furniture -> System.out.printf("%2d - %s\n", furniture.getMaterial(), furniture.getName()));
	}
	
	public void InitFurnitureList() {
		
		this.furnitures.add(new GardenFurniture("plastic", "chair"));
		this.furnitures.add(new GardenFurniture("plastic", "table"));
		this.furnitures.add(new SaloonFurniture("wood", "chair"));
		this.furnitures.add(new SaloonFurniture("wood", "table"));
		this.furnitures.add(new ChildFurniture("wood", "closet"));
		this.furnitures.add(new ChildFurniture("wood", "table"));
		this.furnitures.add(new ChildFurniture("wood", "chair"));
	
	}
}
	
