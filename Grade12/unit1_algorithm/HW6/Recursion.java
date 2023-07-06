package Grade12.unit1_algorithm.HW6;

import java.util.Scanner;

/*
 * Recursion.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: Calculate gcd of two num
 */
public class Recursion {
    public static void main(String[] args) {
        int x;
        int powN;
        int m;
        int n;
        int squN;
        int pNum;
        int height;

        Scanner sc = new Scanner(System.in);
        System.out.println("X^n");
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter n: ");
        powN = sc.nextInt();
        System.out.println(x + "^" + powN + " = " + power(x, powN));

        System.out.println("\nGCD");
        System.out.print("Enter m: ");
        m = sc.nextInt();
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.println("GCD: " + gcd(m, n));

        System.out.println("\nSquare");
        System.out.print("Enter n: ");
        squN = sc.nextInt();
        System.out.println("Square(n) = " + square(squN));

        System.out.println("\nPrime number");
        System.out.print("Enter number: ");
        pNum = sc.nextInt();
        if (prime(pNum, pNum - 1) == true) {
            System.out.println(pNum + " is prime number");
        } else {
            System.out.println(pNum + " is not prime number");
        }
        System.out.println("\nHanoi Tower");
        System.out.print("Enter height: ");
        height = sc.nextInt();
        hanoi(height);

        sc.close();
    }

    public static int power(int x, int n) {
        if (n != 0) {
            return x * power(x, n - 1);
        } else {
            return 1;
        }
    }

    public static int gcd(int m, int n) {
        if (m == n) {
            return m;
        } else if (m > n) {
            return gcd(n, m - n);
        } else {
            return gcd(n, m);
        }
    }

    public static int square(int n) {
        if (n == 1) {
            return 1;
        } else {
            return square(n - 1) + 2 * n - 1;
        }
    }

    public static boolean prime(int pNum, int i) {
        if (pNum <= 0 || pNum == 1) {
            return false;
        } else if (i == 1) {
            return true;
        } else if (pNum % i == 0) {
            return false;
        } else {
            return prime(pNum, i - 1);
        }
    }

    public static void hanoi(int heigth) {
        hanoi(heigth, 'a', 'b', 'c');
    }

    public static void hanoi(int heigth, char from, char by, char to) {
        if (heigth == 0) {
            return;
        }
        hanoi(heigth - 1, from, to, by);
        System.out.println(from + " to " + by);
        hanoi(heigth - 1, by, from, to);
    }
}
