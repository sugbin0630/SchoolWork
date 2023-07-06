package Grade11.unit2.HW23_Output;

import java.util.*;

/*
TimesTable.java
Made by Austin
Made in 2022 05/29
Purpose : Print 12*12 table
*/
public class TimesTable {
    public static void main(String[] args) {
        // Array
        int[][] array;
        array = new int[12][12];

        Scanner sc = new Scanner(System.in);

        // Initialize array
        // row
        for (int i = 0; i <= 11; i++) {
            // column
            for (int j = 0; j <= 11; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        // Print header of table
        System.out.print("     ");
        for (int i = 0; i <= 11; i++) {
            System.out.printf("%-5d", i + 1);
        }
        System.out.println("");
        // End of printing header

        // Print table
        for (int i = 0; i <= 11; i++) {
            System.out.printf("%-5d", i + 1); // print header row
            // column
            for (int j = 0; j <= 11; j++) {
                System.out.printf("%-5d", array[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}