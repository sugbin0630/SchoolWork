package Grade11.unit2.HW18_Output;

import java.util.*;

/*
SquareCube.java
Made by Austin
Made in 2022 04/21
Purpose : ask n and show 1*1 + 2*2 ... + n*n, and 1*1*1 + 2*2*2 .... + n*n*n
*/
public class SquareCube {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        int cubeSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Upper Limit:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i * i;
            cubeSum += i * i * i;
        }
        System.out.println("The sum of Squares is " + sum);
        System.out.print("The sum of Cubes is " + cubeSum);
        sc.close();
    }
}