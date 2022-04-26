package com.bilgeadam.boost.lesson011;

public class PrimitiveTypeWrapper {

	public static void main(String[] args) {
		
		int a = 5;
		
		Integer aObj = Integer.valueOf(a); //converts into wrapper class
		if(aObj instanceof Integer) {
			System.out.println("Integer object is created " +aObj);
			
		double b = 1.23;
		Double bObj = Double.valueOf(b);
		System.out.println("Double object is crated " + bObj);
			
		}
		
		//Autoboxing
		int a1 = 5;
		//converts into wrapper class
		Integer a1Obj = a1;
		//converts into wrapper class
		double b1 = 6.5;
		Double b1Obj = b1;
		

	}

}
