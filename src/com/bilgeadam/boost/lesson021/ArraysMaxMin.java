package com.bilgeadam.boost.lesson021;

//import java.util.Arrays;

public class ArraysMaxMin {

	public static void main(String[] args) {
		
		int [] array1 = {56, 34, 1, 8, 101, -2, -33};
//		
//		int min = Integer.MAX_VALUE; //array1[0];
//		int max = Integer.MIN_VALUE; //array1[0];
		
		int min = array1[1];
		int max = array1[2];
		
	
//		for (int i : array1) {
//			
//			if(i<min) {
//				min =i;
//			}
//			if (i>max)  {
//				max =i;
//			}
		
		for (int i=0; i<array1.length; i++) {
			if(i<array1[i]) {
				max =array1[i];
			}
			if(i>array1[i]) {
				min =array1[i];
			}
		} 
		System.out.println(min);
		System.out.println(max);
}
}