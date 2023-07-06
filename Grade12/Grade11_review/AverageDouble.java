package Grade12.Grade11_review;

import java.util.*;

public class AverageDouble {
    public static void main(String[] args) {
        double d1;
        double d2;
        double d3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First double: ");
        d1 = sc.nextDouble();
        System.out.print("Enter Second double: ");
        d2 = sc.nextDouble();
        System.out.print("Enter third double: ");
        d3 = sc.nextDouble();

        sc.close();

        System.out.println("Average Number: " + (d1 + d2 + d3) / 3);
    }
}
