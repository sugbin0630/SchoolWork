package Grade11.unit2.HW11_Output;

import java.util.*;

/*
program name : Discriminant.java
Made by Austin
Made in 2022 03/09
Purpose : 
*/
public class HW11_Output_Discriminant {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double ans;

        Scanner sc = new Scanner(System.in);

        System.out.println("Write number a,b,c");
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.print("c = ");
        c = sc.nextDouble();

        ans = b * b - 4 * a * c;

        if (ans == 0) {
            System.out.println("1 root");
        } else if (ans > 0) {
            System.out.println("2 roots");
        } else if (ans < 0) {
            System.out.println("no root");
        }
        sc.close();
    }
}