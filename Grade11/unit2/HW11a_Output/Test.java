package Grade11.unit2.HW11a_Output;

import java.util.*;

/*
Made by Austin
Made in 2022 03/24
Purpose : Write the test result and figure out it is passed or not
*/
public class Test {
    public static void main(String[] args) {
        int mark;
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your test mark");
        mark = sc.nextInt();

        if (mark >= 0 && mark <= 100) {
            if (mark >= 50) {
                System.out.print("Passed");
            } else {
                System.out.print("Failed");
            }
        } else {
            System.out.print("Over range");
        }
        sc.close();
    }
}