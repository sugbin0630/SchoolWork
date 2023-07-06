package Grade11.unit2.HW25_Output;

import java.util.*;

/*
Array1DOddEven.java
Made by Austin
Made in 2022 05/02
Purpose : ask 10 num and output numbers are even or odd or neither
*/
public class Array1DOddEven {
    public static void main(String[] args) {
        // Array
        int[] array;
        array = new int[10];
        // Variable
        int even = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        if (even == 0) {
            System.out.print("\nAll odd");
        } else if (even == array.length) {
            System.out.print("\nAll even");
        } else {
            System.out.print("\nNeither");
        }
        sc.close();
    }
}