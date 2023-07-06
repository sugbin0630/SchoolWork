package Grade12.Grade11_review;

import java.util.*;

public class Fastfood {
    public static void main(String[] args) {
        final double PST = 0.08;
        final double GST = 0.05;
        double burgerCost = 1.69;
        double friesCost = 1.09;
        double sodaCost = 0.99;
        int burgerNum;
        int friesNum;
        int sodaNum;
        double total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Num of burgers: ");
        burgerNum = sc.nextInt();
        System.out.print("Num of fries: ");
        friesNum = sc.nextInt();
        System.out.print("Num of soda: ");
        sodaNum = sc.nextInt();

        total = burgerCost * burgerNum + friesCost * friesNum + sodaCost * sodaNum;
        System.out.printf("%f.2 Total cost: ", total);
        System.out.printf("%f.2 Final Cost: ", total + total * PST + total * GST);

        sc.close();
    }
}
