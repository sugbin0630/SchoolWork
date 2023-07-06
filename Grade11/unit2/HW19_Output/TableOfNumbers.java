package Grade11.unit2.HW19_Output;

import java.util.*;

/*
TableOfNumbers.java
Made by Austin
Made in 2022 04/21
Purpose : ask x and y, print the pattern base on x and y
*/
public class TableOfNumbers {
    public static void main(String[] args) {
        // variable
        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x:  ");
        x = sc.nextInt();

        System.out.print("Enter y:  ");
        y = sc.nextInt();

        for (int i = 1; i <= x; i++) // x is row
        {
            for (int j = 1; j <= y; j++) // y is column
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        sc.close();
    }
}