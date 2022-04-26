package com.bilgeadam.boost.lesson011;

public class BoxingUnboxing {
	public static void main(String[] args) {
		int primitiveNumber =5;
		Integer complexNumber = primitiveNumber; //Boxing primitive türü sınıfa dönüştürme
		System.out.println(complexNumber);
		
		Boolean isTrue = null;
		if(isTrue == null) {
		isTrue = false;
	}
	if(isTrue) 
	System.out.println("True");
	else
	System.out.println("False");
}
}
