package com.bilgeadam.boost.lesson012.Homework;

import java.util.Random;
import java.util.Scanner;

public class RockPaperStoneGame {

	public static void main(String[] args) {
	
		int computerMove = getRandomMove(0); 
		int yourMove;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Let the game begin");
		
		while(true) {
		System.out.println("Please select your move 1.Rock, 2.Paper, 3.Scissor");
		yourMove = scanner.nextInt();
		if(yourMove == 1 ||  yourMove==2 ||yourMove == 3);
		break;
		} 
		System.err.println(yourMove + " is not applicable, please try again");
		
	  	if(computerMove == 1) {
		  		if(yourMove == 1) {
		  			System.out.println("It is scoreless");
		  	}
	  		else if(yourMove == 2)  {
		  			System.out.println("You win!");
		  	} 
		  		else {
		  			System.out.println("You lost!");
		  		}
	  	}
	  	if(computerMove == 2) {
		  		if(yourMove == 2) {
		  			System.out.println("It is scoreless");
		  	} 
		  	else if(yourMove == 1)  {
		  			System.out.println("You win!");
		  		}
		  	}
		  	else {
		  		System.out.println("You lost!");
		  }
		  if(computerMove == 3) {
		  		if(yourMove == 3) {
		  			System.out.println("It is scoreless");
		  	} else  {
		  		if(yourMove == 1)  {
		  			System.out.println("You win!");
		  	} else {
		  		System.out.println("You lost!");
		  	}
	  	
	}
	}
		  }
	private static int getRandomMove(int computerMove) {
		Random rnd =new Random();
		int randomMove = rnd.nextInt(3);
		return randomMove;
	}
}