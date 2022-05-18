package com.bilgeadam.boost.lesson022.homework;

import java.util.ArrayList;
import java.util.Arrays;


public class ListHomeWork {

//	private static final int LIST_LENGTH = 100;

	public static void main(String[] args) {
		
		int [] numberListEven= new int[100];
		int [] numberListOdd= new int[100];
		
	//	ArrayList<Integer> numberList = new ArrayList<>();
		
	//	for (int counter = 1; counter < LIST_LENGTH; counter++) {}
		
		for (int i = 0; i < numberListEven.length; i =i+2) {
			int j = numberListEven[i];
			
			System.out.print(i +",");
		}
		for (int i = 1; i < numberListOdd.length; i=i+2) {
			int j = numberListOdd[i];
			
			System.out.print(i +",");
	}

		//System.out.println(Arrays.toString(numberListOdd));
//		System.out.println();
//		System.out.println(Arrays.toString(numberListEven));
//		System.out.println();
		System.out.println(numberListEven);
		System.out.println();
		System.out.println(numberListOdd);
}
}