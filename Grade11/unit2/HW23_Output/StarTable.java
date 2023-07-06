package Grade11.unit2.HW23_Output;

import java.util.*;

/*
StarTable.java
Made by Austin
Made in 2022 04/29
Purpose : draw star table
*/
public class StarTable {
    public static void main(String[] args) {
        // Array
        char[][] array;
        // Variable
        int row;
        int column;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        row = sc.nextInt();
        System.out.print("Enter column: ");
        column = sc.nextInt();

        // Intalize Array
        array = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = '*';
            }
        }

        // row
        for (int i = 0; i < row; i++) {
            // column
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}