package Grade11.unit2.HW25_Output;

import java.util.*;

/*
Tennis.java
Made by Austin
Made in 2022 05/03
Purpose : output who won tennis game
*/
public class Tennis {
    public static void main(String[] args) {
        // Array
        int[][] array;
        array = new int[2][5];
        // Variable
        int set;
        int player1 = 0;
        int player2 = 0;

        Scanner sc = new Scanner(System.in);

        // User Input
        for (int i = 0; i < array[0].length; i++) {
            set = i + 1;
            System.out.println("Set " + set);
            System.out.print("Player1 score: ");
            array[0][i] = sc.nextInt();
            System.out.print("Player2 score: ");
            array[1][i] = sc.nextInt();
            System.out.println("");
        }
        // Count score
        for (int i = 0; i < array[0].length; i++) {
            if (array[0][i] > array[1][i]) {
                player1++;
            } else if (array[0][i] < array[1][i]) {
                player2++;
            }
        }
        // Output winner
        System.out.println("Total " + player1 + "vs" + player2);
        if (player1 > player2) {
            System.out.print("Player1 Win!");
        } else if (player1 < player2) {
            System.out.print("Player2 Win!");
        } else {
            System.out.print("Draw!");
        }
        sc.close();
    }
}