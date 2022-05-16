package com.bilgeadam.boost.lesson020.interface01;

public class Triangle implements Polygon {

	int a;
	int b;
	
	@Override
	public double calcOfArea() {
		System.out.println("non-parameter: ");
		return a*b/2;
	}

	@Override
	public double calcOfArea(int a, int b) {
		System.out.println(calcOfArea());
		System.out.println("area of the triangle: ");
		return a*b/2;
	}

}
