package Grade11.unit2.HW11a_Output;import java.util.*;/*
Made by Austin
Made in 2022 03/24
Purpose : ask age of user and figure out it's enough age to drive
*/
public class Driving {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);        System.out.print("Write your age : ");
        age = sc.nextInt();
        System.out.print("\n");        if (age < 18) {
            System.out.print("Too young to drive");
        } else if (age > 75) {
            System.out.print("Sorry you are over the legal age limit for driving");
        } else {
            System.out.print("Age OK.  Have you got a driver��s licence?");
        }
        sc.close();
    }
}