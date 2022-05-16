package com.bilgeadam.boost.lesson021;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayLesson {

	public static void main(String[] args) {
		// This is a basic example about ARRAYS
		
		double [] data; //double array definition
		
		data =  new double [10]; //allocate memory
		
		double[] data2 = new double[8];
		
		int [] age = {12,4,5,2,5};
		
		int [] age2 = new int[5];  //initailize an array
		age[0] = 12;
		age[1] = 4;
		age[2] = 5;
		age[3] = 2;
		age[4] = 5;
		
		//access each array elements
		System.out.println("first element: " + age[0]);
		System.out.println("second element: " + age[1]);
		System.out.println("third element: " + age[2]);
		System.out.println("fourth element: " + age[3]);
		System.out.println("fifth element: " + age[4]);
		
		
		//loop through the array
			//using for loop
		for(int i = 0; i<age.length; i++) {
			System.out.println(age[i]);
		}
		
			//using foreach loop
		for (int i : age) {
			System.out.println(i);
		}
		
		//array to string
		String temp = Arrays.toString(age);
		System.out.println(temp);
	}

}
