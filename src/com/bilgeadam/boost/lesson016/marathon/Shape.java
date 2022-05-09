package com.bilgeadam.boost.lesson016.marathon;

public class Shape {
	//This is an example that provides to calculate area and perimter for n-shape (max-4).
	
	double areaOfTriangle; 
	double perimeterOfTriangle;
	double areaOfRectangle;
	double perimeterOfRectangle;
	double side1, side2, side3, side4;
	
	void calcOfTriangle() {
		
		double halfLength = (side1+side2+side3)/2;
		areaOfTriangle = halfLength*(halfLength-side1)*(halfLength-side2)*(halfLength-side3);
		System.out.println("The area of the triangle is: " + Math.sqrt(areaOfTriangle)); //this formule allows to take the square root.
		
		perimeterOfTriangle =side1+side2+side3;
		System.out.println("The perimeter of the triangle is: " +perimeterOfTriangle);

	}
	
	void calcOfRectangle() {
		
		areaOfRectangle=side1*side2;
		System.out.println("The area of the rectangle is: " + areaOfRectangle);
		
		perimeterOfRectangle=side1+side2+side3+side4;
		System.out.println("The perimeter of the rectangle is: " +perimeterOfRectangle);
	}
	
	boolean calcTwoSide() {
		
		System.err.println("Error! Two sided shape area or perimeter cannot calculate");
		return false;
	}
}
