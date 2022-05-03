package com.bilgeadam.boost.lesson016.homepractice;

import java.util.Scanner;

public class GradeAvaragCalculator {

	public static void main(String[] args) {
		/*
		 In this example, there are some basics which are scanner and if else.
		 */

			
			double lessonMusic;
			
			int midTerm;
			int finalNote;
			
			Scanner input = new Scanner(System.in);
			System.out.println("please enter your music midterm note");
			midTerm = input.nextInt();
			System.out.println("please enter your music final exam note");
			finalNote = input.nextInt();
			
			lessonMusic = (midTerm*0.4) + (finalNote*0.6);
			
			if(lessonMusic<60) {
				System.out.println("You did not pass the lesson");
			} else
				System.out.println("Congrulations! You passed the music lesson");
			
			input.close();

	}

}
