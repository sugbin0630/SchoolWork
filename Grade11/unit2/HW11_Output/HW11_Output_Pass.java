package Grade11.unit2.HW11_Output;

import java.util.*;

/*
Made by Austin
Made in 2022 03/09
Purpose : ask two number and addition of it
and check the answer is correct or incorrect
*/
public class HW11_Output_Pass {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        double userResult;

        Scanner sc = new Scanner(System.in);

        System.out.print("Write two number\nnum1: ");
        num1 = sc.nextDouble();
        System.out.print("num2: ");
        num2 = sc.nextDouble();
        System.out.print("num1 + num2 = ");
        userResult = sc.nextDouble();

        result = num1 + num2;

        if (userResult == result) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
        sc.close();
    }
}