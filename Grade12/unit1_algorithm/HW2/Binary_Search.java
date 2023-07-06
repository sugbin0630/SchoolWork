package Grade12.unit1_algorithm.HW2;

import java.util.*;

/*
 * Binary_Search.java
 * Made by Austin
 * Made in 2022 10/17
 * Purpose: binary_search algorithm
 */
public class Binary_Search {
    public static void main(String[] args) {
        int[] ary = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int item;
        int bottom = 0;
        int top = ary.length - 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        item = sc.nextInt();
        if (loop_binary(ary, item, top, bottom) != -1 && recursive_binary(ary, item, top, bottom) != -1) {
            System.out.println("Index of your item(loop) is " + loop_binary(ary, item, top, bottom));
            System.out.print("Index of your item(recursive) is " + recursive_binary(ary, item, top, bottom));
        } else {
            System.out.print("item not found");
        }
        sc.close();
    }

    public static int loop_binary(int[] ary, int item, int top, int bottom) {

        int middle;
        int i = -1;
        boolean found = false;

        while (bottom <= top && found == false) {
            middle = (bottom + top) / 2;
            if (item == ary[middle]) {
                found = true; // item has been found
                i = middle;
            } else if (item > ary[middle]) { // not in the bottom half
                bottom = middle + 1;
            } else {// not in the top half
                top = middle - 1;
            }
        }
        return i;
    }

    public static int recursive_binary(int[] ary, int item, int top, int bottom) {
        int middle = (bottom + top) / 2;
        if (bottom > top) {
            return -1;
        }
        middle = (bottom + top) / 2;
        if (ary[middle] == item) {
            return middle;
        } else if (ary[middle] > item) {
            return recursive_binary(ary, item, middle - 1, bottom);
        } else {
            return recursive_binary(ary, item, top, middle + 1);
        }
    }
}
