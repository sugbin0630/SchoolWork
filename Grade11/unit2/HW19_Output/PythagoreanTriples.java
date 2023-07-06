package Grade11.unit2.HW19_Output;

import java.util.*;

/*
PythagoreanTriples.java
Made by Austin
Made in 2022 04/22
Purpose : ask positive integer, and print pythagorean triple that is less or equal with entered integer
*/
public class PythagoreanTriples {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        for (int b = num; b > 0; b--) {
            for (int a = num; a > 0; a--)// for a<b
            {
                for (int c = num; c > 0; c--) {
                    if (a * a + b * b == c * c) {
                        System.out.printf("%d^2 + %d^2 = %d^2", a, b, c);
                        a = 0;// to prevent print one more time
                        b = 0;
                        c = 0;
                    }
                }
            }
        }
        sc.close();
    }
}