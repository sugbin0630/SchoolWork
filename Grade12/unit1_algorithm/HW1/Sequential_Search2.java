package Grade12.unit1_algorithm.HW1;

import java.util.*;

/*
 * Sequential_Search2.java
 * Made by Austin
 * Made in 2022 10/13
 * Purpose: searching algorithm with random number array
 */
public class Sequential_Search2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ary = new int[20];
        int item;
        for (int i = 0; i <= ary.length - 1; i++) {
            ary[i] = (int) (Math.random() * 11);
        }
        System.out.print("Enter item: ");
        item = sc.nextInt();
        if (seqSearch(item, ary) != -1) {
            System.out.println("index of the item: " + seqSearch(item, ary));
        } else {
            System.out.println("item not found");
        }
        sc.close();
    }

    /**
     * @param item
     * @param list
     * @return index of result of reserch, -1 if item does not exist
     */
    public static int seqSearch(int item, int[] list) {
        int index = -1;
        for (int i = 0; i <= list.length - 1; i++) {
            if (list[i] == item) {
                index = i;
                return index;
            }
        }
        return index;
    }
}
