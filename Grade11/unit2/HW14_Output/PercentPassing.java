package Grade11.unit2.HW14_Output;

import java.util.*;

/*
PercenPassing.java
Made by Austin
Made in 2022 03/31
Purpose : ask number until user input negative num, and count the num of input; num of over 70
*/
public class PercentPassing {
    public static void main(String[] args) {
        int num = 0;
        int score = 0; // num of input
        int score70 = 0; // num of over 70 input
        Scanner sc = new Scanner(System.in);

        System.out.println("Write any positive number,\nwrite negative number to terminate");

        while (num >= 0) {
            num = sc.nextInt();
            if (num >= 0) // dont count negative num
            {
                score = score + 1;
                if (num > 70) {
                    score70 = score70 + 1;
                }
            }
        }

        if (score70 <= 1 && score <= 1) // plural / singular is important
        {
            System.out.print(score + " input,\n" + score70 + " input over 70");
        } else if (score <= 1) {
            System.out.print(score + " input,\n" + score70 + " inputs over 70");
        } else {
            System.out.print(score + " inputs,\n" + score70 + " inputs over 70");
        }
        sc.close();
    }
}