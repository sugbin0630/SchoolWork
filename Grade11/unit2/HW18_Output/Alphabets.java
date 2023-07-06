package Grade11.unit2.HW18_Output;

import java.util.*;

/*
Alphabets.java
Made by Austin
Made in 2022 04/14
Purpose : ask letters and count small, capital letters until non-alphabets entered
*/
public class Alphabets {
    public static void main(String[] args) {
        char letter;
        int total;
        int capital = 0;
        int small = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a letter : ");
            letter = sc.nextLine().charAt(0);

            if (letter <= 'Z' && letter >= 'A') {
                capital++; // count capital letters
            } else if (letter <= 'z' && letter >= 'a') {
                small++; // count small letters
            }

        } while (letter <= 'Z' && letter >= 'A' || letter <= 'z' && letter >= 'a');

        total = capital + small; // count total letters

        System.out.println("You have entered " + capital + " upper case letters");
        System.out.println("You have entered " + small + " lower case letters");
        System.out.println("You have entered " + total + " vowels");
        sc.close();
    }
}