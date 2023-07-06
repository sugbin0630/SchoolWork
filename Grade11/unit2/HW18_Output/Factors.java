package Grade11.unit2.HW18_Output;

import java.util.*;

/*
Factors.java
Made by Austin
Made in 2022 04/21
Purpose : ask any integer, and show all factor numbers
*/
public class Factors {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        // positive integer
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) // if i is factor number
                {
                    System.out.println(i);
                }
            }
        }
        // negative integer
        if (num < 0) {
            for (int i = num; i >= num; i++) {
                if (i != 0) // x/0 is impossible
                {
                    if (num % i == 0) {
                        System.out.println(i);
                    }
                }
            }
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}