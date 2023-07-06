package Grade11.unit2.HW13_Output;

import java.util.*;

//Math.abs need java.lang in old version
/*
LastDigitVer2.java
Made by Austin
Made in 2022 03/29
Purpose : change LastDigit.java more effeciently
*/
public class LastDigitVer2 {
    public static void main(String[] args) {
        int userNum;
        int lastDigit;
        String lastNum; // lastDigit to word
        Scanner sc = new Scanner(System.in);

        System.out.print("Write any integer : ");
        userNum = sc.nextInt();

        if (userNum >= 0) {
            lastDigit = userNum % 10;
        } else {
            lastDigit = userNum * -1 % 10;
        }
        switch (lastDigit) {
            case 0:
                lastNum = "zero";
                break;
            case 1:
                lastNum = "one";
                break;
            case 2:
                lastNum = "two";
                break;
            case 3:
                lastNum = "three";
                break;
            case 4:
                lastNum = "four";
                break;
            case 5:
                lastNum = "five";
                break;
            case 6:
                lastNum = "six";
                break;
            case 7:
                lastNum = "seven";
                break;
            case 8:
                lastNum = "eight";
                break;
            case 9:
                lastNum = "nine";
                break;
            default:
                lastNum = "Error!"; // if program print this, program has problem
        }

        System.out.print("The last digit of " + userNum + " is " + lastNum);
        // bigger, smaller than absolute value 10000
        sc.close();
    }
}