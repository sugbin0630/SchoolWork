package Grade11.unit2.HW25_Output;

import java.util.*;

/*
DiagonalSmallest.java
Made by Austin
Made in 2022 05/03
Purpose : fill 4*4 array, output smallest num on diagnal lines
*/
public class DiagonalSmallest {
    public static void main(String[] args) {
        // Array
        int[][] array;
        array = new int[4][4];
        // Variable
        int smallest;
        Scanner sc = new Scanner(System.in);

        // fill array
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " row");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a number: ");
                array[i][j] = sc.nextInt();
            }
        }
        // this program work because this array is square

        // any number on diagnal line
        smallest = array[0][0];
        // read diagonal line (L up to R down)
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] < smallest) {
                smallest = array[i][i];
            }
        }
        // read diagonal line (R up to L down)
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i][i] < smallest) {
                smallest = array[i][i];
            }
        }
        System.out.print("Smallest number on diagnal line is: " + smallest);
        sc.close();
    }
}