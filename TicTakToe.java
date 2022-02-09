package com.mason.tictactoe;

import java.util.Scanner;
public class TicTakToe {

	static int SQUARE_ONE,SQUARE_TWO,SQUARE_THREE,SQUARE_FOUR,SQUARE_FIVE,SQUARE_SIX,SQUARE_SEVEN,SQUARE_EIGHT,SQUARE_NINE; //each space on the tic-tac-toe board
	
	static boolean BOARD_ISFULL() { 
		if (SQUARE_ONE > 0 && SQUARE_TWO > 0 && SQUARE_THREE > 0 && SQUARE_FOUR > 0 && SQUARE_FIVE > 0 && SQUARE_SIX > 0 &&
				SQUARE_SEVEN > 0 && SQUARE_EIGHT > 0 && SQUARE_NINE > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	static void client1() {
		if (BOARD_ISFULL()) {
			
			System.out.print("Board full. game end.\n");
			
			System.out.print("Thanks for playing!");
			System.exit(0);
		} else {
			boolean var1 = false;
			
			Scanner s = new Scanner(System.in);
			System.out.println("client 1's next move:");
			
			int move = s.nextInt();
			if (move == 1) {
				SQUARE_ONE = 1;
			}
			else if (move == 2) {
				SQUARE_TWO = 1;
			}
			else if (move == 3) {
				SQUARE_THREE = 1;
			}
			else if (move == 4) {
				SQUARE_FOUR = 1;
			}
			else if (move == 5) {
				SQUARE_FIVE = 1;
			}
			else if (move == 6) {
				SQUARE_SIX = 1;
			}
			else if (move == 7) {
				SQUARE_SEVEN = 1;
			}
			else if (move == 8) {
				SQUARE_EIGHT = 1;
			}
			else if (move == 9) {
				SQUARE_NINE = 1;
			}
			else if (move == 0) { 
				System.out.print("Thanks for playing!");
				System.exit(0);
			}
			else {
				System.out.println("Invalid move.");
				client1();
				var1 = true;
			}
			if (!var1) displayBoard();
		}
	}
	
	static void client2() {
		
		if (BOARD_ISFULL()) {
			System.out.print("Board full. game end.\n");
			System.out.print("Thanks for playing!");
			System.exit(0);
		} else {
			boolean var1 = false;
			Scanner s = new Scanner(System.in);
			System.out.println("client 2's next move:");
			int move = s.nextInt();
			if (move == 1) {
				SQUARE_ONE = 1;
			}
			else if (move == 2) {
				SQUARE_TWO = 2;
			}
			else if (move == 3) {
				SQUARE_THREE = 2;
			}
			else if (move == 4) {
				SQUARE_FOUR = 2;
			}
			else if (move == 5) {
				SQUARE_FIVE = 2;
			}
			else if (move == 6) {
				SQUARE_SIX = 2;
			}
			else if (move == 7) {
				SQUARE_SEVEN = 2;
			}
			else if (move == 8) {
				SQUARE_EIGHT = 2;
			}
			else if (move == 9) {
				SQUARE_NINE = 2;
			}
			else if (move == 0) {
				System.out.print("Thanks for playing!");
				System.exit(0); 
			}
			else {
				System.out.println("Invalid move.");
				client2();
				var1 = true;
			}
			if (!var1) {
				displayBoard();
			}
		}
	}
	
	static void displayBoard() { 
		
		System.out.println("Current board is:");
		
		System.out.println(SQUARE_ONE + " " + SQUARE_TWO + " " + SQUARE_THREE);
		
		System.out.println(SQUARE_FOUR + " " + SQUARE_FIVE + " " + SQUARE_SIX);
		
		System.out.println(SQUARE_SEVEN+ " " + SQUARE_EIGHT + " " + SQUARE_NINE);
	}
	
	public static void main(String[] args) { //main method
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Tic Tac Toe!");
		while (true) { 
			client1();
			client2();
			
		}
	}
}
