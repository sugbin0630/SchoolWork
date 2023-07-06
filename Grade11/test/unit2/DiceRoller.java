package Grade11.test.unit2;

import java.util.Scanner;

/*
DiceRoller.java
Made by Austin 
Made in 2022 04/25
Purpose : ask user which dice u want to roll, and roll it
*/
public class DiceRoller {
	public static void main(String[] args) {

		// variable
		int dice;
		int result;
		Scanner sc = new Scanner(System.in);

		// print
		System.out.println("========== ELECTRONIC DICE ROLLER ==========");
		System.out.println("Please enter the number for the kind of die you would like to roll:");
		System.out.println("4-sided die    (generates numbers from 1 to 4)");
		System.out.println("6-sided die    (generates numbers from 1 to 6)");
		System.out.println("8-sided die    (generates numbers from 1 to 8)");
		System.out.println("10-sided die   (generates numbers from 1 to 10)");
		System.out.println("20-sided die   (generates numbers from 1 to 20)");
		System.out.print("\nWhat kind of die do you want to roll? ");
		dice = sc.nextInt();

		// random number
		if (dice == 4) {
			result = (int) ((Math.random() * 5) + 1);

			System.out.println("\nYou rolled a: " + result);
		} else if (dice == 6) {
			result = (int) ((Math.random() * 7) + 1);

			System.out.println("\nYou rolled a: " + result);
		} else if (dice == 8) {
			result = (int) ((Math.random() * 9) + 1);

			System.out.println("\nYou rolled a: " + result);
		} else if (dice == 10) {
			result = (int) ((Math.random() * 11) + 1);

			System.out.println("\nYou rolled a: " + result);
		} else if (dice == 20) {
			result = (int) ((Math.random() * 21) + 1);

			System.out.println("\nYou rolled a: " + result);

			if (result == 1) {
				System.out.print("VERY BAD");
			} else if (result <= 9) {
				System.out.print("Poor roll");
			} else if (result <= 14) {
				System.out.print("Average roll");
			} else if (result <= 19) {
				System.out.print("Good roll");
			} else if (result == 20) {
				System.out.print("VERY GOOD");
			} else {
				System.out.print("Error!");
			}
		} else {
			System.out.print("Error!");
		}
		sc.close();
	}
}