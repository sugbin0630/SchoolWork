package Grade11.unit2.HW11_Output;

import java.util.*;

/*
Made by Austin
Made in 2002 03/09
Purpose : calculate how much money salesperson take
*/
public class HW11_Output_Salary {
    public static void main(String[] args) {
        final double BASE = 1000;
        double amountSale;
        double rate;
        double total;

        Scanner sc = new Scanner(System.in);
        System.out.print("Write how much did u sold : ");
        amountSale = sc.nextInt();

        if (amountSale >= 10) {
            rate = amountSale / 100;
            total = BASE + BASE * rate;

            System.out.printf("A salesperson earned : $%,.2f for a mounth.%n", total);
        } else {
            System.out.printf("A salesperson earned : $%,.2f for a mounth.%n", BASE);
        }
        sc.close();
    }
}