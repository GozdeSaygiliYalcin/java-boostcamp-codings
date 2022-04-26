package com.bilgeadam.boost.lesson008;

import java.text.BreakIterator;
import java.util.Scanner;

public class BMICalculation {

	public static void main(String[] args) {
		
		double height, weight, bmi;
		String gender= "W";
	
		
		Scanner o1 =new Scanner(System.in);
		
		System.out.println("Enter your gender W or M");
		gender = o1.next();
		
		System.out.println("Enter your height");
		height = o1.nextDouble();
		
		System.out.println("Enter your weight");
		weight = o1.nextDouble();
		
		bmi = weight * (10000/(height*height));
		
		if (gender.equalsIgnoreCase("W")) {
		
		}if(bmi<19) {
			System.out.println("Underweight");
			
		}else if(bmi<24) {
			System.out.println("Normal");
			
		}else if(bmi<30) {
			System.out.println("Overweight");
		
		}else if(gender.equalsIgnoreCase("M")) {
			
		}if(bmi<20) {
			System.out.println("Underweight");
			
		}else if(bmi<25) {
			System.out.println("Normal");
			
		}else if(bmi<30) {
			System.out.println("Overweight");
			
		}else {
		System.out.println("Obese");
	}
		
}
}



