package com.bilgeadam.boost.lesson021;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//1. Copying arrays with using assignment operators
		
		int[] numbers = {1,2,3,4,5,6};
		
		int[] positiveNumbers = numbers;
		
		for(int number:positiveNumbers) {
			System.out.print(number +",");
		}
		//Aşağıdaki çıktıda arraylerin tutulduğu adreslerin aynı olduğu görülüyor
		System.out.println(numbers);
		System.out.println(positiveNumbers);
		
		
		//2. Using looping construct to copy areas
		int[] source = {1,2,3,4,5,6};
		int destination[] = new int[source.length];
		
		//iterate and copy elements from source to destination
		for(int i=0; i<source.length; i++) {
			destination[i] = source[i];
			
			
		}
		System.out.println(source);
		System.out.println(destination);
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(destination));

	

		//3. Copying arrays using arraycopy() method
		// arraycopy(object source, int sourcePosition, object destination, int destPosition, int length)
	
		int [] n1 = {1,2,3,4,12,12,-1};
		int [] n3 = new int[5];
		
		int [] n2 = new int [n1.length];
		
		//the entire n1 is copied to the n2
		System.arraycopy(n1, 0, n2, 0, n1.length);
		System.out.println(Arrays.toString(n2));
		
		
		System.arraycopy(n1, 2, n3, 1, 2);
		System.out.println(Arrays.toString(n3));
		
		
	
}
}