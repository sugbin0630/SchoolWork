package Grade11.unit2.HW13_Output;

import java.util.*;
/*
Tip.java
Made by Austin
Made in 2022 03/29
Purpose : ask ics grade to user and give tip to them
*/

public class Tip {
    public static void main(String[] args) {
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please write your ics grade : ");
        grade = sc.nextLine().charAt(0); // read only first latter
        switch (grade) {
            case 'A':
                System.out.print("perfect!");
                break;
            case 'a':
                System.out.print("perfect!");
                break;
            case 'B':
                System.out.print("Nice");
                break;
            case 'b':
                System.out.print("Nice");
                break;
            case 'C':
                System.out.print("soso");
                break;
            case 'c':
                System.out.print("soso");
                break;
            case 'D':
                System.out.print("review the course again");
                break;
            case 'd':
                System.out.print("review the course again");
                break;
            case 'F':
                System.out.print("Try again");
                break;
            case 'f':
                System.out.print("Try again");
                break;
            default:
                System.out.print("Write again");
                break;
        }
        sc.close();
    }
}