package Grade12.unit1_algorithm.HW3;

import java.util.*;
/*
 * Sequential_Search3.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: insertion sorting algorithm
 */
public class Insertion_Sort3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        double[] ary = new double[sc.nextInt()];
        for (int i = 0; i < ary.length; i++){ 
            System.out.print("ary[" + i + "]: ");
            ary[i] = sc.nextInt();
        }
        insertionSort(ary);
        if (ary.length % 2 == 0) {
            System.out.print("Median: " + (ary[ary.length / 2 -1] + ary[ary.length / 2]) / 2);
        }
        else {
            System.out.print("Median: " + ary[(ary.length - 1) / 2]);
        }
        sc.close();
    }
    /*
     * Question 5: because skip swaping progress, stable sorting is more faster than non stable sorting 
     */
    public static void insertionSort(double[] ary) {
        double swap;
        double key;
        int j;
        for (int i = 1; i < ary.length; i++){
            key = ary[i];
            j = i -1;
            while (j >= 0 && key < ary[j]){
                swap = ary[j];
                ary[j] = ary[j+1];
                ary[j+1] = swap;
                j--;
            }
            ary[j+1] = key;
        }
    }
}