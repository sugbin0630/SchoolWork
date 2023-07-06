package Grade11.unit2.HW11_Output;

import java.util.*;

/*
Made by Austin
Made in 2022 03/09
Purpose : check the state of integer
*/
public class HW11_Output_CheckInt {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Write integer :");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("the integer is positive");
            if (num % 2 == 0) {
                System.out.println("and even");
            } else {
                System.out.println("and odd");
            }
            if (num % 7 == 0) {
                System.out.println("and multiple of 7");
            } else {
                System.out.println("and not mulitple of 7");
            }
        } else {
            System.out.println("the integer is negative");
            if (num % 2 == 0) {
                System.out.println("and even");
            } else {
                System.out.println("and odd");
            }
            if (num % 7 == 0) {
                System.out.println("and multiple of 7");
            } else {
                System.out.println("and not mulitple of 7");
            }
        }
        sc.close();
    }
}