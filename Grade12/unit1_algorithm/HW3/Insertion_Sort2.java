package Grade12.unit1_algorithm.HW3;
/*
 * Sequential_Search3.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: insertion sorting algorithm
 */
public class Insertion_Sort2 {
    public static void main(String[] args) {
        String[] ary = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        insertionSort(ary);
        for (int i = 0; i < ary.length; i++){
            System.out.println(ary[i]);
        }
    }

    public static void insertionSort(String[] ary) {
        String swap;
        String key;
        int j;

        for (int i = 1; i < ary.length; i++){
            key = ary[i];
            j = i -1;
            while (j >= 0 && key.compareTo(ary[j]) <= 0){
                swap = ary[j];
                ary[j] = ary[j+1];
                ary[j+1] = swap;
                j--;
            }
            ary[j+1] = key;
        }
    }
}
