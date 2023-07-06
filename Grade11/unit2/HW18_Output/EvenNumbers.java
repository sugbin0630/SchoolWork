package Grade11.unit2.HW18_Output;

import java.util.*;

/*
EvenNumbers.java
MAde by Austin
Made in 2022 04/21
Purpose : count even nunmbers
*/
public class EvenNumbers {
    public static void main(String[] args) {
        // variables
        int even = 0;
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter an interger: ");
            num = sc.nextInt();

            if (num % 2 == 0 && num > 0) {
                even++; // count even numbers
            }
        } while (num > 0);
        System.out.print("You have entered " + even + " even numbers.");
        sc.close();
    }
}