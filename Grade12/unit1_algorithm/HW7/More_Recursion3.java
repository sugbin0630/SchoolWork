package Grade12.unit1_algorithm.HW7;

import java.util.Scanner;

/*
 * More_Recursion3.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: 
 */
public class More_Recursion3 {
    public static void main(String[] args) {
        int[] list = { 1, 3, 4, 6, 2, 5, 14, 12, 9 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        System.out.print("End: ");
        System.out.print("Largest number: " + largest(list));
        sc.close();
    }

    public static int largest(int[] list) {
        return largest(list, 0, list.length - 1);
    }

    public static int largest(int[] list, int start, int end) {
        if (start == end) {
            return 0;
        }
        if (list[start] > largest(list, start + 1, end)) {
            return list[start];
        } else {
            return largest(list, start + 1, end);
        }
    }
}
