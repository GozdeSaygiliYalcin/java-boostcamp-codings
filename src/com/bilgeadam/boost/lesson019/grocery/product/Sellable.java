package com.bilgeadam.boost.lesson019.grocery.product;

public interface Sellable {
	
	int PRICE =0;
	
	double calcEndPrice(double discountRate);
	
	default void notifySell() {
		System.out.println("product is selled");
	}
		
	

}
