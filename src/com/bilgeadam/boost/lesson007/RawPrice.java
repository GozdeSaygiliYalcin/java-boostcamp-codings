package com.bilgeadam.boost.lesson007;

import java.util.Scanner;

public class RawPrice {

	public static void main(String[] args) {
		
		double endPrice;
		double priceWithoutVat;
		double rawPrice;

		
		Scanner s1= new Scanner(System.in);
		System.out.println("Please Enter the End Price");
		
		endPrice = s1.nextInt();
		priceWithoutVat = (endPrice*100)/(118);
		rawPrice = (priceWithoutVat*100)/(115);
		
		System.out.println("Raw Price="+rawPrice);
		s1.close();
	}

}
