package Grade11.unit2.HW19_Output;

import java.util.*;

/*
TriangleOfNumbers.java
Made by Austin
Made in 2022 04/21
Purpose : ask y, print the triangle pattern base on y
*/
public class TriangleOfNumbers {
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter y:  ");
        y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= i; j++)// j <= i makes result look like triangle
            {
                System.out.print(j);
            }
            System.out.println(""); // next line
        }
        sc.close();
    }
}