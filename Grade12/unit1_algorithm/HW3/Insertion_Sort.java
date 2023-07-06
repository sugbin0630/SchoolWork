package Grade12.unit1_algorithm.HW3;

/*
 * Sequential_Search3.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: insertion sorting algorithm
 */
public class Insertion_Sort {
    public static void main(String[] args) {
        double[] ary = { 6, 2, 8, 3, 1, 7, 4 };
        insertionSort(ary);
    }

    public static void insertionSort(double[] ary) {
        double key;
        int j;
        for (int i = 1; i < ary.length; i++) {
            key = ary[i];
            j = i - 1;
            while (j >= 0 && key < ary[j]) {
                ary[j + 1] = ary[j];
                j--;
            }
            ary[j + 1] = key;
            printAry(ary);
        }
    }

    public static void printAry(double[] ary) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println("");
    }
}
