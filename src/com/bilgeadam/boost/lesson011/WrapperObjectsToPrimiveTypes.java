package com.bilgeadam.boost.lesson011;

public class WrapperObjectsToPrimiveTypes {

	public static void main(String[] args) {
		
		
		Integer aObj = Integer.valueOf(23);
		
		int a = aObj.intValue();//converts into primitive types //wrapper class değişkeni ilkel(primitive) tipe değişkenine çeviriyoruz.
		
		System.out.println("The value of a: "+a);
		
		
		//Unboxing
		Integer a1Obj = Integer.valueOf(23);
		int a1 = a1Obj; //converts into primitive types
		
		Double d1Obj =Double.valueOf(1.45);
		double d1 = d1Obj;
		
		
	}

}
