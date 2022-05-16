package com.bilgeadam.boost.lesson021;

import java.util.Arrays;
import java.util.Scanner;

public class ChessKnight {

	public static void main(String[] args) {
		
		
		int [][] board = new int[8][8];
		for (int i=0; i<8; i++) {
			Arrays.fill(board[i], -1);
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please refer to column(a-h): ");
		String sq1 = sc.nextLine();
		
		System.out.print("please refer to line (1-8): ");
		int sq2 = sc.nextInt();
		sc.close();
		int colNum = sq1.charAt(0)-97;
		int linNum = sq2-1;
		board[linNum][colNum] = 0;
		if(sq2-2>0) {
			board[linNum-2][colNum-1] = 1;
			board[linNum-2][colNum+1] = 1;
			
		}
		
		

		for (int i= 7; i>=0; i--) {
			for (char a ='a'; a<='h'; a++) {
				if(board[i][a-97]==-1 ) {
					System.out.printf(" %c%d ", a, i+1);
					
				}
				else {
					if(board[i][a-97]==0)
						System.out.printf(" Knight ");
					else 
						System.err.printf("XX");
					
				}
				
			}
			System.out.println();
	}
}
}
