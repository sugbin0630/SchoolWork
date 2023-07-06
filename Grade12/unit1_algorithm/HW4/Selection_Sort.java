package Grade12.unit1_algorithm.HW4;

/*
 * Sequential_Search3.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: Selection sorting algorithm
 */
public class Selection_Sort {
    public static void main(String[] args) {
        String[] ary = { "Renee", "Brien", "Vincent", "Doris", "Scarlett" };
        selectionSort(ary);
    }

    public static void selectionSort(String[] ary) {
        String swap;
        for (int i = 0; i < ary.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[tmp].compareTo(ary[j]) >= 0) {
                    tmp = j;
                }
            }
            swap = ary[i];
            ary[i] = ary[tmp];
            ary[tmp] = swap;
            printAry(ary);
        }
    }

    public static void printAry(String[] ary) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println("");
    }
}