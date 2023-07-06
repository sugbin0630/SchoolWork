package Grade12.unit1_algorithm.HW7;

import java.util.Scanner;

/*
 * More_Recursion2.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: asterisks
 */
public class More_Recursion2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = sc.nextInt();
        printRow(n);
        System.out.println("\n");
        printTriangle(n);
        sc.close();
    }

    public static void printRow(int n) {
        if (n >= 1) {
            System.out.print("* ");
            printRow(n - 1);
        }
    }

    public static void printTriangle(int n) {
        if (n >= 1) {
            printTriangle(n -1);
            printRow(n);
            System.out.print("\n");
        }
    }
}
