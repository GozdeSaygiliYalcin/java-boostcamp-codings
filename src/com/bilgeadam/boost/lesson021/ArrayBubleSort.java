package com.bilgeadam.boost.lesson021;

import java.util.Arrays;

public class ArrayBubleSort {

	public static void main(String[] args) {
		
		int [] array = {3, 7, 12, 43, 54, 43, 28, 3, 19, -24, -19};

		int temp;
		
			for (int i=0; i<array.length; i++) {
				for(int j= i+1; j<array.length; j++)
					
					if(array[i]>array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
			}
		}
			String temp1 = Arrays.toString(array);
			System.out.println(temp1);
	}
}