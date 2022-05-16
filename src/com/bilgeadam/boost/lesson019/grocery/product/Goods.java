package com.bilgeadam.boost.lesson019.grocery.product;

public class Goods extends Product implements Sellable{
	
	private double sellPrice;
	private String unit;
	
	
	@Override
	public double calcEndPrice(double discountRate) {
		// TODO Auto-generated method stub
		return 0;
	}

}
