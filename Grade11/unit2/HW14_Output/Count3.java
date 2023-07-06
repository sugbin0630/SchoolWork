package Grade11.unit2.HW14_Output;

import java.util.*;

/*
Count3.java
Made by Austin
Made in 2022 03/31
Purpose : Write a while loop that outputs numbers from a to b where a and b are entered by the user
*/
public class Count3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Write integer \"a\" : ");
        a = sc.nextInt();
        System.out.print("Write integer \"b\" : ");
        b = sc.nextInt();

        if (a <= b) // when b is bigger
        {
            while (a <= b) {
                System.out.println(a);
                a = a + 1;
            }
        } else // when b is smaller
        {
            while (a >= b) {
                System.out.println(a);
                a = a - 1;
            }
        }
        sc.close();
    }
}