package Grade11.unit2.HW20_Output;

import java.util.*;

/*
Numbers.java
Made by Austin
Made in 2022 04/25
Purpose : ask 6 numbers and label it
*/
public class Numbers {
    public static void main(String[] args) {
        final int length = 6;
        // Arrays
        double[] array;
        array = new double[length];
        // Variables
        int num;
        double add;

        Scanner sc = new Scanner(System.in);

        // ask array values
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number: ");
            num = sc.nextInt();

            array[i] = num;
        }
        // reverse
        System.out.println("\nReverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        // add 10%
        System.out.println("\nAdd 10%:");
        for (int i = 0; i < array.length; i++) {
            add = array[i] + array[i] / 10;
            System.out.println(add);
        }
        // over 50
        System.out.println("\nOver 50:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50) {
                System.out.println(array[i]);
            }
        }
        sc.close();
    }
}