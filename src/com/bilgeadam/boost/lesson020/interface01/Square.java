package com.bilgeadam.boost.lesson020.interface01;

//import java.util.Scanner;

public class Square implements Polygon {
	int a ;
	int b;
	
	
	@Override
	public double calcOfArea(int a, int b) {
		System.out.println(calcOfArea());
		System.out.println("area of the square: ");
//		Scanner input = new Scanner(a, b);
//		a = input.nextInt();
//		b = input.nextInt();
		return a*b;
	}


	@Override
	public double calcOfArea() {
		System.out.println("non-parameter");
		return a*b;
	}


}
