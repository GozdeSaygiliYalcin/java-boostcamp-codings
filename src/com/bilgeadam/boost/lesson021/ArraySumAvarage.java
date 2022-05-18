package com.bilgeadam.boost.lesson021;

import java.util.Arrays;

public class ArraySumAvarage {
	
	public static void main(String[] args) {
		
		int [] array1 = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		double avarage = 0;
		double total = 0;
		for(int i = 0; i<array1.length; i++) {
			total += array1[i];
			avarage = (total)/(array1.length);
			
			
	}
		System.out.println("The array is:" + Arrays.toString(array1));
		System.out.println("Total of the array is: " + total);
		System.out.println("Avarage of the array is: " + avarage);
		
}
}