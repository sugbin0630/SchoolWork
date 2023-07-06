package Grade11.unit2.HW18_Output;

import java.util.*;

/*
Power.java
Made by Austin
Made in 2022 04/21
Purpose : ask N and X, solve X^N
*/
public class Power {
    public static void main(String[] args) {
        // variables
        double x;
        double x1; // first x
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X");
        x = sc.nextDouble();
        x1 = x;

        System.out.println("Enter N");
        n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i < n; i++) {
                x = x * x1;
            }
            System.out.print(x1 + " raised to the power " + n + " is:  ");
            System.out.printf("%.5f", x); // for only 5 decimal point
        } else {
            System.out.print("N must be a positive integer.");
        }
        sc.close();
    }
}