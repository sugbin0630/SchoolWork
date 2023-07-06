package Grade12.unit1_algorithm.HW9;

import java.util.*;

public class Pattern_Generator {
    /*
     * Pattern Generator
     * Write a program that repeatedly reads two numbers n and k and prints
     * all bit patterns of length n with k ones in descending order (when the
     * bit patterns are considered as binary numbers). You may assume that
     * 30 >= n > 0, 8 > k >= 0, and n >= k. The first number in the input
     * gives the number of pairs n and k. The numbers n and k are separated
     * by a single space. Leading zeroes in a bit pattern should be included.
     * See the example below.
     * Sample input
     * 3
     * 2 1
     * 2 0
     * 4 2
     * Sample output
     * The bit patterns are
     * 10
     * 01
     * The bit patterns are
     * 00
     * The bit patterns are
     * 1100
     * 1010
     * 1001
     * 0110
     * 0101
     * 0011
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int ones = sc.nextInt();
        generate(length, ones, "");

        sc.close();
    }

    public static void generate(int len, int numOne, String soFar) {
        // solution #1
        if (len == 0 && numOne == 0) {
            System.out.println(soFar);
        } else if (len >= 0 && numOne >= 0) {
            // only continue if the remaining length
            // and remaining number of ones is greater than 0

            // adding a '1' to the end, decrease the length and number of '1' by 1
            generate(len - 1, numOne - 1, soFar + "1");

            // adding a '0' to the end, decrease the length by 1
            // (number of 1 remaining stays the same
            generate(len - 1, numOne, soFar + "0");
        }

        // solution #2
        if (len == 0 && numOne == 0) {
            System.out.println(soFar);
        } else if (len >= numOne) {
            if (numOne > 0) {
                generate(len - 1, numOne - 1, soFar + "1");
            }
            generate(len - 1, numOne, soFar + "0");
        }
    }
}
