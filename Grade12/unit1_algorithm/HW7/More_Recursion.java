package Grade12.unit1_algorithm.HW7;

import java.util.Scanner;

/*
 * More_Recursion.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: Hanoi problem
 */
public class More_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Hanoi tower: ");
        System.out.print(countMoves(sc.nextInt()) + " movements for sorting Hanoi tower");
        sc.close();
    }

    public static int countMoves(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 2 * countMoves(n - 1) + 1;
        }
    }
}