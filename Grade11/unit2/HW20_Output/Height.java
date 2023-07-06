package Grade11.unit2.HW20_Output;

import java.util.*;

/*
Height.java
Made by Austin
Made in 2022 04/25
Purpose : ask 20 people height and output all height above average
*/
public class Height {
    public static void main(String[] args) {
        // variables
        int[] height;
        int average = 0;
        height = new int[20];

        Scanner sc = new Scanner(System.in);

        // enter 20 height
        for (int i = 0; i < height.length; i++) {
            System.out.print("Enter height(cm): ");
            height[i] = sc.nextInt();
            average += height[i];
        }
        average /= 20;
        System.out.println("Height average is: " + average);
        // output height above average
        for (int i = 0; i < height.length; i++)
        // i < height.length NOT i <= .length
        {
            if (height[i] > average) {
                System.out.println(height[i]);
            }
        }
        sc.close();
    }
}