package com.bilgeadam.boost.lesson016.marathon;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// This is a test class for shape class which can calculate area and perimeter.
		
		
		Shape shape =new Shape();
		
		while(shape.side1 !=-1  && shape.side2 !=-1 && shape.side3 !=-1 && shape.side4 !=-1) {
			
		Scanner input =new Scanner(System.in);
		System.out.println("please enter the lengths of the shape (max 4 sides) that you want to be calculated. You can exit using -1");
		
		System.out.print("1.please enter the length of the first side (end with 0): ");
		shape.side1=input.nextInt();
		
			if(shape.side1 == -1) {
			System.out.println("The program is ended. Bye!");
				break;
			
			} else if(shape.side1 ==0) {
				shape.calcTwoSide();
				continue;
			}
			
		System.out.print("2.please enter the length of the second side (end with 0): ");
		shape.side2=input.nextInt();
		
			if(shape.side2 == -1) {
			System.out.println("The program is ended. Bye!");
			break;
			} else if(shape.side2 ==0) {
				shape.calcTwoSide();
				continue;
			}
			
		System.out.print("3.please enter the length of the third side (end with 0): ");
		shape.side3=input.nextInt();
		
			if(shape.side3 == -1) {
			System.out.println("The program is ended. Bye!");
			break;
			
			} else if(shape.side3 ==0) {
				shape.calcTwoSide();
				continue;
			}
			
		System.out.print("4.please enter the length of the fourth side (end with 0): ");
		shape.side4=input.nextInt();
		
			if(shape.side4 == -1) {
			System.out.println("The program is ended. Bye!");
			break;
		
			} else if  (shape.side1 != 0 && shape.side2 !=0 && shape.side3 != 0 && shape.side4 !=0) {
				
				shape.calcOfRectangle();
				
			} else if (shape.side1 !=0 && shape.side2 !=0 && shape.side3 !=0 && shape.side4 ==0) {
				
				shape.calcOfTriangle();
			}
		}	
	}
}

	

