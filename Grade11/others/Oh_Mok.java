package Grade11.others;

import java.util.Scanner;

/*
Made by Austin
Made in 2022 08/15
Purpose Oh_Mok
*/
public class Oh_Mok {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] end = { false };
		boolean[] turn = { true };
		int[] player = { 1 };
		int row;
		int column;
		int[][] board = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		draw_board(board);
		while (end[0] != true) {
			do {
				do {
					System.out.print("\nrow : ");
					row = sc.nextInt();
					sc.nextLine();
					if (row > board.length || row < 0) {
						System.out.println("\ntry again");
					}
				} while (row > board.length || row < 0);
				do {
					System.out.print("column : ");
					column = sc.nextInt();
					if (column > board.length || column < 0) {
						System.out.print("\ntry again");
					}
				} while (column > board.length || column < 0);
				if (board[row][column] != 0) {
					System.out.println("\nalready filled");
				}
			} while (board[row][column] != 0);
			if (turn[0] == true) {
				board[row][column] = 1;
			} else {
				board[row][column] = 2;
			}
			draw_board(board);
			win(end, turn, board, player);
			turnChange(turn, player);
		}
		sc.close();
	}

	public static void win(boolean[] end, boolean[] turn, int[][] board, int[] player) {
		for (int i = 0; i <= board.length - 1; i++) { // column bingo
			for (int j = 0; j <= board.length - 1; j++) {
				if (board[i][j] == player[0] && board[i][j + 1] == player[0] && board[i][j + 2] == player[0]
						&& board[i][j + 3] == player[0] && board[i][j + 4] == player[0]
						&& board[i][j + 6] != player[0]) {
					System.out.print("\nplayer " + player[0] + " Win!");
					end[0] = true;
				}
			}
		}
		if (end[0] != true) {
			for (int i = 0; i <= board.length; i++) { // row bingo
				for (int j = 0; j <= board.length; j++) {
					try {
						if (board[j][i] == player[0] && board[j][i + 1] == player[0] && board[j][i + 2] == player[0]
								&& board[j][i + 3] == player[0] && board[j][i + 4] == player[0]) {
							System.out.print("\nplayer " + player[0] + " Win!");
							end[0] = true;
						}
						if (board[j][i + 6] != player[0]) {
							end[0] = false;
						}
					} catch (ArrayIndexOutOfBoundsException e) {

					}
				}
			}
		}
		// diagnal bingo
		else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1 && end[0] != true) {
			System.out.print("\nplayer " + player[0] + " Win!");
			end[0] = true;
		}
		if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1 && end[0] != true) {
			System.out.print("\nplayer " + player[0] + " Win!");
			end[0] = true;
		}
	}

	public static void turnChange(boolean[] turn, int[] player) {
		if (turn[0] == true) {
			turn[0] = false;
			player[0] = 2;
		} else {
			turn[0] = true;
			player[0] = 1;
		}
	}

	public static void draw_board(int[][] board) {
		System.out.println("     0   1   2   3   4   5   6   7   8   9  10  11  12  13  14 "); // print grid
		System.out.println("   |---+---+---+---+---+---+---+---+---+---+---+---+---+---+---| ");
		for (int i = 0; i <= 14; i++) { // row
			if (i <= 9) {
				System.out.print(" " + i); // print grid
			} else {
				System.out.print(i); // print grid
			}
			for (int j = 0; j <= 14; j++) { // column
				System.out.print(" | ");
				System.out.print(piece_shape(board, i, j));
			}
			System.out.print(" | ");
			if (i <= 9) {
				System.out.print(" " + i); // print grid
			} else {
				System.out.print(i); // print grid
			}
			System.out.println("\n   |---+---+---+---+---+---+---+---+---+---+---+---+---+---+---| ");
		}
		System.out.println("     0   1   2   3   4   5   6   7   8   9  10  11  12  13  14 "); // print grid
	}

	public static char piece_shape(int[][] board, int i, int j) {
		switch (board[i][j]) {
		case 0:
			return ' ';
		case 1:
			return 'O';
		case 2:
			return 'X';
		default:
			return '?';
		}
	}
}