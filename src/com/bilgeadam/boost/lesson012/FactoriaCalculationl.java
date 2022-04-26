package com.bilgeadam.boost.lesson012;

public class FactoriaCalculationl {

	public static void main(String[] args) {
		int number =5;
		double fact = calculateClassicalFactorial(number);
	
		System.out.println("Factorial of number is " + number);

	}
	private static double calculateClassicalFactorial(int number) {
		double fact = 1;
		if(number == 0 || number ==1)  {
		return fact;
	
	}
	else {
		for(int i = 1; i<=number; i++) {
			fact = fact*i;
		}
	}
	return fact;
}
}
