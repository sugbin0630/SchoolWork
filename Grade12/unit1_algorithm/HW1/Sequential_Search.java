package Grade12.unit1_algorithm.HW1;

import java.util.*;

/*
 * Sequential_Search.java
 * Made by Austin
 * Made in 2022 10/12
 * Purpose: search algorithm
 */
public class Sequential_Search {
    public static void main(String[] args) {
        String[] list = { "123", "456", "789", "1", "2" };
        String item;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item: ");
        item = sc.nextLine();
        if (seqSearch(item, list) != -1) {
            System.out.println("index of the item: " + seqSearch(item, list));
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
    public static int seqSearch(String item, String[] list) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(item)) {
                index = i;
                return index;
            }
        }
        return index;
    }
}