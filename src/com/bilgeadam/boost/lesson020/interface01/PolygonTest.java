package com.bilgeadam.boost.lesson020.interface01;

//import java.util.Scanner;

public class PolygonTest {

	public static void main(String[] args) {
		
	//	Scanner input = new Scanner(12);
	//	System.out.println("enter the length of polygon");
		
		Polygon tri = new Triangle();
		Polygon four =new Square();
		
		tri.calcOfArea(30, 5);
		System.out.println("---------------");
		four.calcOfArea(12, 12);
		System.out.println("---------------");
		
		System.out.println(tri.calcOfArea());
		System.out.println("---------------");
		
		System.out.println(four.calcOfArea());
		System.out.println("---------------");
		
		System.out.println(tri.calcOfArea(5 , 6));
		System.out.println("---------------");
		System.out.println(four.calcOfArea(12,12));

	}

}
