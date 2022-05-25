package com.bilgeadam.boost.lesson025;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		// This is a basic lambda expressions example
		
		LambdaExampleFunctionInterface lambda = (a,b) -> {System.out.println(a + "+" + b); return a+b;};
		int sum = lambda.process(10, 20);
		System.out.println(sum);	
		
	}

	private static int sumOfArray(int a, int b) {
	
		System.out.println(a + "+" + b); 
			
		return a+b;
}
}
