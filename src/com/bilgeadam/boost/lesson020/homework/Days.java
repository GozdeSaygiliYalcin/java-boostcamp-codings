package com.bilgeadam.boost.lesson020.homework;

public class Days {
	public static void main(String[] args) {
		String [] days = { "monday", "tuesday", "wednesday"};
		String [] weekendDays = new String []{ "saturday", "sunday"};
		
		System.out.println(days.length);
		System.out.println(weekendDays.length);
		
		int cars[], count=3;
		cars = new int[count];
		for(int i=0; i<cars.length; i++)
		    cars[i] = (i+1)*2;  //this gives (0+1)*2 =2 (1+1)*2 =4 (0+1)*2 =6
		
			for(int j=0; j<cars.length; j++)
		    System.out.print(cars[j] + ",");
			
			
	}

}
