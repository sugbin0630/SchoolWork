package Grade11.unit2.HW13_Output;

import java.util.*;

/*
Pass.java
Made by Austin
Made in 2022 03/30
Purpose : Rewrite Pass.java with random structure
*/
public class Pass {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        int userResult;
        int random; // +, -, *, and /
        String sign;

        Scanner sc = new Scanner(System.in);

        // random number is 0 to 100
        num1 = (int) (Math.random() * 101);
        num2 = (int) (Math.random() * 101);

        // choose +, -, *, / randomly
        random = (int) ((Math.random() * 4) + 1);

        switch (random) {
            case 1:
                result = num1 + num2;
                sign = " + ";
                break;
            case 2:
                result = num1 - num2;
                sign = " - ";
                break;
            case 3:
                result = num1 * num2;
                sign = " * ";
                break;
            case 4:
                result = num1 / num2;
                sign = " / ";
                break;
            default: // default wont work; NEVER
                result = -9999;
                sign = "Error!";
                break;
        }

        System.out.print("First number is : " + num1 + "\n");
        System.out.print("Second number is : " + num2 + "\n");

        System.out.printf("%d%s%d%s", num1, sign, num2, " = ");
        userResult = sc.nextInt();

        if (userResult == result) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
        sc.close();
    }
}