package Grade11.unit2.HW11_Output;

import java.util.*;

/*
Made by Austin
Made in 2022 03/09
Purpose : ask age of user and check user's age is enough to vote
*/
public class HW11_Output_AgeCheck {
    public static void main(String[] args) {
        int userAge;
        int leftYear;

        Scanner sc = new Scanner(System.in);

        System.out.print("Wirte your age : ");
        userAge = sc.nextInt();

        if (userAge >= 18) {
            System.out.println("enough to vote");
        } else {
            System.out.println("not enough to vote");
            leftYear = 18 - userAge;
            System.out.println(leftYear + " years before voting is possible");
        }
        sc.close();
    }
}