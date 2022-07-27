package com.bilgeadam.boost.lesson021;

public class ArrayRepetitive {

	public static void main(String[] args) {
		
		
		int [] array1 = {3, 7, 12, 43, 54, 43, 28, 3, 19, -24, -19, 3, 3};
		
		
		for (int i=0; i<array1.length; i++) {
			for(int j=i+1; j<array1.length; j++) {
				
			if(array1[i] == array1[j]) {
				System.out.println("Repetitive numbers are: " + array1[i]);
			}
			
	}
}	
}
}