package Grade11.unit2.HW14_Output;

import java.util.*;

/*
Age.java
Made by Austin
Made in 2022 03/31
Purpose : guess my age
*/
public class Age {
    public static void main(String[] args) {
        int age = 17;
        int ans;
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess my age\nans : ");
        ans = sc.nextInt();

        while (age != ans) {
            if (ans < 0 || ans > 200) {
                System.out.println("What?");// age cannot negative, oldest person in the world is 119 years old
            }
            System.out.println("Wrong\nans : ");
            ans = sc.nextInt();
        }
        System.out.print("Correct!");
        sc.close();
    }
}