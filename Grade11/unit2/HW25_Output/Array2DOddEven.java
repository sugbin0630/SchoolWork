package Grade11.unit2.HW25_Output;

import java.util.*;

/*
Array2DOddEven.java
Made by Austin
Made in 2022 05/02
Purpose : ask 3*3 num and output numbers are even or odd or neither
*/
public class Array2DOddEven {
    public static void main(String[] args) {
        // Array
        int[][] array;
        array = new int[3][3];
        // Variable
        int[] even;
        even = new int[3];

        Scanner sc = new Scanner(System.in);

        // ask 3*3 times
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a number: ");
                array[i][j] = sc.nextInt();
                if (array[i][j] % 2 == 0) {
                    even[i]++; // it works because even.length = array[0].length
                }
            }
            System.out.println("");
        }

        // odd even
        for (int i = 0; i < even.length; i++) {
            if (even[i] == 0) {
                System.out.print("\nAll odd");
            } else if (even[i] == array.length) {
                System.out.print("\nAll even");
            } else {
                System.out.print("\nNeither");
            }
        }
        sc.close();
    }
}