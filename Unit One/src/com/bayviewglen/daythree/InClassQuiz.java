package com.bayviewglen.daythree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InClassQuiz {

	public static void main(String[] args) throws FileNotFoundException {
		// Create a program that reads a 3 x 3 2D Array of x(s), o(s) and .(s). Assuming that this is a grid to display a game of tic tac toe. 

		//Display to the screen one of the following: 

			//1. X WON 
			//2. O WON 
			//3. TIE 
			//4. Not a Valid game (because the number of Xs and Os do not differ by 1)

		Scanner keyboard = new Scanner(new File("Data/tictactoe.dat"));
		
		String[][] Tictactoe = new String[3][3];
		String Result = "";
		Tictactoe=setboard(keyboard);
		
		boolean valid = countvariables(Tictactoe);
		
		if(valid==true) {
			Result = checkboard(Tictactoe);
		}else {
			Result="That is not a valid answer";
		}
		
		System.out.println(Result);
	}

	private static boolean countvariables(String[][] tictactoe) {
		boolean isValid=false;
		int counterx = 0;
		int countery = 0;
		int counterPeriod = 0;
		
		for(int i=0;i<tictactoe.length;i++) {
			for(int j=0;j<tictactoe[i].length;j++) {
				if(tictactoe[i][j].equals("X")) {
					counterx++;
				}else if(tictactoe[i][j].equals("O")) {
					countery++;
				}else {
					counterPeriod++;
				}
			}
		}
		if(counterx-countery!=0||countery-counterx!=0) {
			isValid=false;
		}else if(counterPeriod>3) {
			isValid=false;
		}else {
			isValid = true;
		}
		
		return isValid;
	}

	private static String checkboard(String[][] tictactoe) {
		String Answer = "";

		for(int i=0;i<tictactoe.length;i++) {
			for(int j=0;j<tictactoe[i].length;j++) {
				if(tictactoe[i][j].equals(tictactoe[0][0])) {
					if(tictactoe[i+1][j+1].equals("X")&&tictactoe[i+2][j+2].equals("X")) {
						Answer = "X Won";
						break;
					}else if(tictactoe[i+1][j+1].equals("O")&&tictactoe[i+2][j].equals("O")) {
						Answer = "O Won";
						break;
				}	
			}				
				if(tictactoe[i][j].equals(tictactoe[0][2])) {
					if(tictactoe[i+1][j--].equals("X")&&tictactoe[i+2][j-=2].equals("X")) {
						Answer = "X Won";
						break;
				}else if(tictactoe[i+1][j-1].equals("O")&&tictactoe[i+2][j-2].equals("O")) {
					Answer = "O Won";
					break;
				}
				}
				
				if(tictactoe[i][j].equals("X")) {
					if(tictactoe[i+1][j].equals("X")&&tictactoe[i+2][j].equals("X")) {
						Answer = "X Won";
						break;
					}else if(tictactoe[i][j+1].equals("X")&&tictactoe[i][j+2].equals("X")) {
						Answer="X won";
						break;
					}
				}else if(tictactoe[i][j].equals("O")) {
					if(tictactoe[i+1][j].equals("O")&&tictactoe[i+2][j].equals("O")) {
						Answer = "O Won";
						break;
					}else if(tictactoe[i][j+1].equals("O")&&tictactoe[i][j+2].equals("O")) {
						Answer="O won";
						break;
					}
				}else {
					Answer = "Tie";
				}
				
			}
		}
		
		return Answer;
		
		
	}

	private static String[][] setboard(Scanner keyboard) {
		String[][] board = new String[3][3];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=keyboard.next();
			}
		}
		
		return board;
		
		
	}

}
