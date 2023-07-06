package Grade11.test.unit2;

import java.util.Scanner;

/*
ParkingTracker.java
Made by Austin 
Made in 2022 04/25
Purpose : Make Parking Tracker
*/
public class ParkingTracker {
	public static void main(String[] args) {
		// Arrays
		int[][] array;
		array = new int[3][4];
		// Variables
		int row;
		int column;
		int leftSpace = 12;
		int endMessege = 0;

		Scanner sc = new Scanner(System.in);
		while (endMessege == 0) {
			// map
			System.out.println("  0123");
			System.out.println(" +----+");
			System.out.print("0|");
			for (int i = 0; i <= 3; i++) {
				if (array[0][i] == 1) {
					System.out.print("x");
				} else if (array[0][i] == 0) {
					System.out.print(" ");
				}
			}
			System.out.println("|");

			System.out.print("1|");
			for (int i = 0; i <= 3; i++) {
				if (array[1][i] == 1) {
					System.out.print("x");
				} else if (array[1][i] == 0) {
					System.out.print(" ");
				}
			}
			System.out.println("|");

			System.out.print("2|");
			for (int i = 0; i <= 3; i++) {
				if (array[2][i] == 1) {
					System.out.print("x");
				} else if (array[2][i] == 0) {
					System.out.print(" ");
				}
			}
			System.out.println("|");
			System.out.println(" +----+");

			System.out.println("There are " + leftSpace + " spots available.");
			System.out.print("Please choose a row:      ");
			row = sc.nextInt();

			System.out.print("Please choose a column:   ");
			column = sc.nextInt();

			if (row < 0 || row > 2 || column > 3 || column < 0) {
				System.out.print("\nInvalid spot!  Program ending");
				endMessege = 1; // finish loop
			} else if (row <= 2 && row >= 0 || column <= 3 && column >= 0) {
				if (array[row][column] == 0) {
					System.out.println("Spot " + row + "-" + column + "filled!\n");
					array[row][column] = 1;
					leftSpace--;
				} else if (array[row][column] == 1) {
					System.out.println("Spot " + row + "-" + column + "emptied!\n");
					array[row][column] = 0;
					leftSpace++;
				}
			}
		}
		sc.close();
	}
}