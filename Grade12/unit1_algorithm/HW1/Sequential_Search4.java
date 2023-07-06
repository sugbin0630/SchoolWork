package Grade12.unit1_algorithm.HW1;

import java.util.*;
/*
 * Sequential_Search3.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: searching algorithm
 */
public class Sequential_Search4 {
    public static void main(String[] args) {
        int[] list;
        int item;
        int listLength;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the list: ");
        listLength = sc.nextInt();
        list = new int[listLength];
        for (int i = 0; i <= list.length - 1; i++) {
            while (list[i] == 0){
                System.out.print("Enter " + (i+1) + ". number: ");
                list[i] = sc.nextInt();
                if (list[i] == 0){
                    System.out.println("0 can't be used for the list");
                }
            }
        }
        /*Answer of the 4-c:
         In general, sequential search start from begining of the array or end of the array,
         so the program finds a given value faster the closer it is to the starting point.
         Therefore if the user search same number twice, program will find the given value more faster because 
         program moves the previous search one space toward the starting point
        */
        System.out.println("Enter item to search: ");
        item = sc.nextInt();
        if (seqSearch(item, list) == -1){
            System.out.println("item not found");
        }
        System.out.println("List: ");
        for (int i = 0; i <= list.length - 1; i++) {
            System.out.println(list[i]);
                
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
        int a;
        for (int i = 0; i <= list.length - 1; i++) {
            if (list[i] == item) {
                index = i;
                a = list[i - 1];
                list[i - 1] = list[i];
                list[i] = a;
                return index;
            }
        }
        return index;
    }
}