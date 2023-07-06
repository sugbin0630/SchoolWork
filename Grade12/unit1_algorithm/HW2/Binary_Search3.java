package Grade12.unit1_algorithm.HW2;

import java.util.*;

/*
 * Binary_Search.java
 * Made by Austin
 * Made in 2022 10/17
 * Purpose: rewrite binary_search algorithm
 */
public class Binary_Search3 {
    public static void main(String[] args) {
        int[] ary = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21 };
        int item;
        int bottom = 0;
        int top = ary.length - 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        item = sc.nextInt();
        if (recursive_binary(ary, item, top, bottom) >= 0) {
            System.out.print("Index of your item(recursive) is " + recursive_binary(ary, item, top, bottom));
        } else {
            System.out.print("item not found\nnearest index of item is " + recursive_binary(ary, item, top, bottom) * -1);
        }
        sc.close();
    }
    /*
     Answer of Question 4
     a) 3
     b) 2
     c) 4
     d) 5
     e) 6
     f) 7
     g) 9
     h) 10
     i) 14
     */
    public static int recursive_binary(int[] ary, int item, int top, int bottom) {
        int middle = (bottom + top) / 2;
        if (bottom > top) {
            return (middle)* -1;
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

