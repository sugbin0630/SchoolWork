package Grade11.unit2.HW13_Output;

import java.util.*;

//Math.abs need java.lang in old version
/*
LastDigit.java
Made by Austin
Made in 2022 03/29
Purpose : print last digit number of user's number (in word)
*/
public class LastDigit {
    public static void main(String[] args) {
        int userNum;
        int userAbs;
        int t_digit; // one thousand
        int h_digit; // one hundred
        int ten_digit;
        int lastDigit;
        String lastNum; // lastDigit to word
        Scanner sc = new Scanner(System.in);

        System.out.print("Write any integer less than 10000: ");
        userNum = sc.nextInt();
        // absolute value of userNum
        userAbs = Math.abs(userNum);

        if (userAbs < 10000) {
            if (userAbs >= 1000) {
                t_digit = userAbs / 1000;
                h_digit = userAbs / 100 - t_digit * 10;
                ten_digit = userAbs / 10 - t_digit * 100 - h_digit * 10;
                lastDigit = userAbs - t_digit * 1000 - h_digit * 100 - ten_digit * 10;

                lastNum = switchNum(lastDigit);

                System.out.print("The last digit of " + userNum + " is " + lastNum);
            } else if (userAbs >= 100) {
                h_digit = userAbs / 100;
                ten_digit = userAbs / 10 - h_digit * 10;
                lastDigit = userAbs - h_digit * 100 - ten_digit * 10;

                lastNum = switchNum(lastDigit);

                System.out.print("The last digit of " + userNum + " is " + lastNum);
            } else if (userAbs >= 10) {
                ten_digit = userAbs / 10;
                lastDigit = userAbs - ten_digit * 10;

                lastNum = switchNum(lastDigit);

                System.out.print("The last digit of " + userNum + " is " + lastNum);
            } else if (userAbs >= 0) {
                lastDigit = userAbs;

                lastNum = switchNum(lastDigit);

                System.out.print("The last digit of " + userNum + " is " + lastNum);
            }
        }
        // bigger, smaller than absolute value 10000
        else if (userNum >= 10000) {
            System.out.print("Too high number");
        } else if (userNum <= -10000) {
            System.out.print("Too low number");
        }
        sc.close();
    }

    public static String switchNum(int lastDigit) {
        switch (lastDigit) {
            case 0:
                return "zero";

            case 1:
                return "one";

            case 2:
                return "two";

            case 3:
                return "three";

            case 4:
                return "four";

            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return "nine";

            default:
                return "Error!"; // if program print this, program has problem
        }
    }
}