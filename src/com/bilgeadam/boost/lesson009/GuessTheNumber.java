package com.bilgeadam.boost.lesson009;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	/**
	 * New features if guess is cannot found ten times the competitor will be lost.
	 */

	public static void main(String[] args) {
		
	Random rnd = new Random(); //this is creating random number
	int numberToGuess = rnd.nextInt(101); //this is creating a number between 0 and 100
	boolean numberFound =false; //the number couldn't be found in the first time
	Scanner o1 =new Scanner(System.in); //this is scanner in order to scan
	int guess; //guessed number
	int guessCount = 0;
	
	
	do {
		do {
		System.out.println("please enter a number between 0 and 100");	
		guess = o1.nextInt();
		if (0>guess||guess>100) {
			System.err.println("be careful");
		}
		} while (!(0<=guess) && guess<=100);
		if (guess == 0) {
		
		}
		guessCount++;
		if (guess == numberToGuess) {
			System.out.println("congrulations number found on the" + " "+ guessCount +". try!");
			numberFound = true; //number is found, finish.
		}
		else {
			if (guess>numberToGuess) {
				System.out.println("this is higher");
			}
			else {
				System.out.println("this is lower");
			}
		}
	} while (!numberFound && guessCount<=10);
	
	o1.close();
	if(!numberFound) {
		System.err.println("you lost the game");
	
	}
	System.out.println("i hope it was funny!");
	
	}
	
	
	
}
