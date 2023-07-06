package Grade11.unit2.HW14_Output;

import java.util.*;

/*
Guess.java
Made by Austin
Made in 2022 03/31
Purpose : create random number 1 to 20, and ask what is the number to user until they correct the num
*/
public class Guess {
    public static void main(String[] args) {
        int ranNum = (int) ((Math.random() * 21) + 1);
        int ans;
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess the number between 1 and 20\nans : ");
        ans = sc.nextInt();

        while (ans != ranNum) {
            if (ans > 20 || ans < 1) // when ans out of range
            {
                System.out.println("The number is between 1 and 20");
            }
            System.out.print("Wrong\nans : ");
            ans = sc.nextInt();
        }
        System.out.print("Correct!");

        sc.close();
    }
}