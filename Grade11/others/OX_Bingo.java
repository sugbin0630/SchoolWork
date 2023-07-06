package Grade11.others;

import java.util.Scanner;

/*
Made by Austin
Made in 2022 08/15
Purpose OX bingo
*/
public class OX_Bingo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] end = { false };
		boolean[] turn = { true };
		int[] player = { 1 };
		int row;
		int column;
		int[][] board = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		draw_board(board);
		while (end[0] != true) {
			do {
				do {
					System.out.print("\nrow : ");
					row = sc.nextInt();
					sc.nextLine();
					if (row > 2 || row < 0) {
						System.out.println("\ntry again");
					}
				} while (row > 2 || row < 0);
				do {
					System.out.print("column : ");
					column = sc.nextInt();
					if (column > 2 || column < 0) {
						System.out.print("\ntry again");
					}
				} while (column > 2 || column < 0);
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
		for (int i = 0; i <= 2; i++) { // row bingo
			if (board[i][0] == player[0] && board[i][1] == player[0] && board[i][2] == player[0]) {
				System.out.print("\nplayer " + player[0] + " Win!");
				end[0] = true;
			}
		}
		if (end[0] != true) {
			for (int i = 0; i <= 2; i++) { // column bingo
				if (board[0][i] == player[0] && board[1][i] == player[0] && board[2][i] == player[0]) {
					System.out.print("\nplayer " + player[0] + " Win!");
					end[0] = true;
				}
			}
		}
		// diagnal bingo
		if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1 && end[0] != true) {
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
		System.out.println("  0   1   2 "); // print grid
		for (int i = 0; i <= 2; i++) { // row
			System.out.print(i + " "); // print grid
			for (int j = 0; j <= 2; j++) { // column
				System.out.print(piece_shape(board, i, j));
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			if (i < 2) {
				System.out.println("\n ---+---+---");
			}
		}
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