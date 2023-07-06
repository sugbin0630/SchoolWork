package Grade11.unit2.HW19_Output;

import java.util.*;

/*
Rectange.java
Made by Austin
Made in 2022 04/21
Purpose : ask row and column and draw it with star
*/
public class Rectange {
    public static void main(String[] args) {
        // variable
        int row;
        int column;
        Scanner sc = new Scanner(System.in);

        // ask row and column
        System.out.print("Enter # rows:  ");
        row = sc.nextInt();

        System.out.print("Enter # columns:  ");
        column = sc.nextInt();

        // print result
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}