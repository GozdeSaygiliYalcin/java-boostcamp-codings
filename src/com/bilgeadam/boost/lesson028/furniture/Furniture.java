package com.bilgeadam.boost.lesson028.furniture;

import java.time.LocalDate;

public abstract class Furniture {
	
	
	private String material;
	private String name;
	private LocalDate productDate;
	private Color color;

	
	public Furniture(String material, String name) {
		super();
		this.name = name;
		this.material = material;
	}


	public Furniture(String material, String name, LocalDate productDate, Color color) {
		super();
		this.material = material;
		this.name = name;
		this.productDate = productDate;
		this.color = color;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMaterial() {
		return this.material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "Furniture [material=" + this.material + ", name=" + this.name + "]";
	}


	
}
