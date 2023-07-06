package Grade11.unit2.HW13_Output;

import java.util.*;

/*
FoodOrder.java
Made by Austin 
Made in 2022 03/28
Purpose : ask the option that user want, print cost of it
*/
public class FoodOrder {
    public static void main(String[] args) {
        double op1 = 2.50; // $2.50
        double op2 = 2.50; // $2.50
        double op3 = 3.00; // $3.00
        double op4 = 3.50; // $3.50
        double op5 = 5.00; // $5.00
        // String for switch
        String ans;

        Scanner sc = new Scanner(System.in);
        /*
         * Option 1 : juice, muffin & coffee $2.50
         * Option 2 : cereal, toast & milk $2.50
         * Option 3 : egg, toast & coffee $3.00
         * Option 4 : banana, granola & milk $3.50
         * Option 5 : grapefruit, bacon, eggs & coffee $5.00
         */
        System.out.println("Option 1 : juice, muffin & coffee");
        System.out.println("Option 2 : cereal, toast & milk");
        System.out.println("Option 3 : egg, toast & coffee");
        System.out.println("Option 4 : banana, granola & milk");
        System.out.println("Option 5 : grapefruit, bacon, eggs & coffee");

        System.out.print("Write your choice : ");
        ans = sc.nextLine();

        switch (ans) {
            case "1":
                System.out.printf("$%.2f", op1);
                break;
            case "2":
                System.out.printf("$%.2f", op2);
                break;
            case "3":
                System.out.printf("$%.2f", op3);
                break;
            case "4":
                System.out.printf("$%.2f", op4);
                break;
            case "5":
                System.out.printf("$%.2f", op5);
                break;
            default:
                System.out.print("Try again");
        }
        sc.close();
    }
}