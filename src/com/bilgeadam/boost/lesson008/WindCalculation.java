package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class WindCalculation {

	public static void main(String[] args) {
		
		double wch;
		//Wind Chill
		double vs;
		//Wind Speed
		double tmp;
		//Temperature
		double K;
		//Kelvin
		
		Scanner o1 =new Scanner(System.in);
		System.out.println("please enter speed of wind");
		vs = o1.nextDouble();
		
		System.out.println("please enter temperature");
		tmp = o1.nextDouble();
		
		wch = 33 + (0.478 + 0.237*Math.sqrt(vs)-0.0124)*(tmp-33);
		
		K = (wch-32)/1.8 +273.15;
		
		System.out.println("wind chill effect is" +" " + wch +" "+ "Fahrenait");
		System.out.println("wind chill effect is" +" " + K + " "+ "Kelvin");

	}
 
}
