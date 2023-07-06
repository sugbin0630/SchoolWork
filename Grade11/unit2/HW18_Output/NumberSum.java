package Grade11.unit2.HW18_Output;

import java.util.*;

/*
NumberSum.java
Made by Austin
Made in 2022 04/21
Purpose : ask how many number to sum to user, and sum entered numbers
*/
public class NumberSum {
    public static void main(String[] args) {
        // variable
        int howMany;
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many integers will be added?");
        howMany = sc.nextInt();

        // loop for count
        for (int i = 1; i <= howMany; i++) {
            System.out.println("Enter an integer");
            num = sc.nextInt();
            sum += num;
        }
        System.out.print("\nThe sum is " + sum);
        sc.close();
    }
}
