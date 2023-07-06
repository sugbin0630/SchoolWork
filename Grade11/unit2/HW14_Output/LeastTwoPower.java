package Grade11.unit2.HW14_Output;

import java.util.*;

/*
LeastTwoPower.java
Made by Austin
Made in 2022 03/31
Purpose : find the smallest power of two greater than or equal to user's number
*/
public class LeastTwoPower {
    public static void main(String[] args) {
        int num1;
        int powerOfTwo = 2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Write any intger : ");
        num1 = sc.nextInt();

        if (num1 > 0) // when num1 is positive
        {
            while (num1 > powerOfTwo) {
                powerOfTwo = powerOfTwo * 2;
            }
            System.out.print(powerOfTwo + " is the smallest power of two greater than or equal to " + num1);
        } else {
            System.out.print("impossible");
        }
        sc.close();
    }
}