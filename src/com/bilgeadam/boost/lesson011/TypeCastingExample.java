package com.bilgeadam.boost.lesson011;

public class TypeCastingExample {

	public static void main(String[] args) {
		//widening
		int myInt = 9;
		double myDouble = myInt; //Automatic casting int to double
		
//		System.out.println(myDouble);
//		System.out.println(myInt);
		
		//narrowing
		double myDouble2 = 9.78d;
		int myInt2 = (int)myDouble; //Manual Casting double to int
		
//		System.out.println(myDouble2);
//		System.out.println(myInt2);
	
		
		//Type conversion from int to the String
		int num =10;
		System.out.println("The integer value is :" + num);
		
		String data =String.valueOf(num); //converts int to string type // int value has been converted to the String
		System.out.println("The string value is: "+ data);
		
		//Type conversion from String to the int
		String data2 = "10";
		System.out.println("The String value is: " + data2);
		
		int num2 = Integer.parseInt(data2); //converts string variable to int // String value has been converted to the int
		System.out.println("The integer value is :"+num2);
		

	}

}
