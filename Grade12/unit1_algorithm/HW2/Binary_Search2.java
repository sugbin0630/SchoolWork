package Grade12.unit1_algorithm.HW2;

import java.util.*;
/*
 * Binary_Search2.java
 * Made by Austin
 * Made in 2022 10/17
 * Purpose: binary_search algorithm with descending order
 */
public class Binary_Search2 {
    public static void main(String[] args) {
        int[] ary = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int item;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        item = sc.nextInt();
        if (loop_binary(ary, item) != -1) {
            System.out.println("Index of your item(loop) is " + loop_binary(ary, item));
        } else {
            System.out.print("item not found");
        }
        sc.close();
    }
    public static int loop_binary(int[] ary, int item) {
        int bottom = 0;
        int top = ary.length - 1;
        int middle;
        int i = -1;
        boolean found = false;

        while (bottom <= top && found == false) {
            middle = (bottom + top) / 2;
            if (item == ary[middle]) {
                found = true; // item has been found
                i = middle;
            } else if (item > ary[middle]) { // not in the bottom half
                top = middle + 1;
            } else {// not in the top half
                bottom = middle - 1;
            }
        }
        return i;
    }
}