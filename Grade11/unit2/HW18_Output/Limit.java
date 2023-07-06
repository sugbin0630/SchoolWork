package Grade11.unit2.HW18_Output;

import java.util.*;

/*
Limit.java
Made by Austin
Made in 2022 04/21
Purpose : 1/1 + 1/2 + 1/3 + 1/4 ..... + 1/N
*/
public class Limit {
    public static void main(String[] args) {
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;// it must be 1.0 not only 1
        }
        System.out.print("\nSum is: " + sum);
        sc.close();
    }
}