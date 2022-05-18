package com.bilgeadam.boost.lesson021;

import java.util.Arrays;
import java.util.Scanner;

public class ChessKnight {
	
	private static final int EMPTY_CELL = -1;
	private static final int KNIGHTS_POSITION = 0;
	private static final int POSSIBLE_MOVE = 1;
	
	private int colNum;
	private int linNum;
	private int [][] chess;
	
	public static void main(String[] args) {
		
		Chess chessGame = new Chess();
		chessGame.initChessBoard();
		chessGame.readKnightPosition();
		chessGame.calculatePossiblePositions();
		chessGame.printChessBoard();
		
		
		for (int i=0; i<8; i++) {
			Arrays.fill(chess[i], EMPTY_CELL);
		}
		
		chess = readKnightPosition(chess);
		chess = calculatePossibleMove(chess);
	
		
		colNum = sq1.toLowerCase().charAt(0-97);
		linNum = colNum-1;
		chess[linNum][colNum] = KNIGHTS_POSITION;
		
		
		}
		
		

		for (int row= 7; i>=0; i--) {
			for (char ch ='a'; ch<='h'; ch++) {
				if(board[row][ch-'a']==-POSSIBLE_MOVE ) {
					System.out.printf(" %c%d ", ch, row+1);
					
				}
				else {
					if(board[row][ch-'a']==0)
						System.out.printf(" Knight ");
					else 
						System.out.printf("XX");
					
				}
				
			}
			System.out.println();
	}
		
	private static int[][] calculatePossibleMove(int[][] board) {
		if(colNum-2>=0) {
			board[linNum-2][colNum-1] = POSSIBLE_MOVE;
			board[linNum-2][colNum+1] = POSSIBLE_MOVE;
		return null;
	}
}
	private static int[][] readKnightPosition(int[][] board) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please refer to column(a-h): ");
		String sq1 = sc.nextLine();
		
		System.out.print("please refer to line (1-8): ");
		int sq2 = sc.nextInt();
		sc.close();
		return board;
	}
}
