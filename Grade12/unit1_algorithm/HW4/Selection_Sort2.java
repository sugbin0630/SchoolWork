package Grade12.unit1_algorithm.HW4;

import java.util.*;
/*
 * Sequential_Search3.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: Selection sorting algorithm
 */
public class Selection_Sort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] ary = new String[10];
        for (int i = 0; i < ary.length; i++){
            System.out.print("ary[" + i + "]: ");
            ary[i] = sc.nextLine();
        }
        selectionSort(ary);
        for (int i = 0; i < ary.length; i++){
            System.out.println(ary[i]);
        }
        sc.close();
    }

    public static void selectionSort(String[] ary) {
        String swap;
        for (int i = 0; i < ary.length; i++) {
            int tmp = i;
            for (int j = i+1; j < ary.length; j++){
                if (ary[tmp].compareTo(ary[j]) >= 0){
                    tmp = j;
                }
            }
            swap = ary[i];
            ary[i] = ary[tmp];
            ary[tmp] = swap;
        }
    }
}