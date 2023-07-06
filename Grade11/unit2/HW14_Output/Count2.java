package Grade11.unit2.HW14_Output;

/*
Count2.java
Made by Austin
Made in 2022 03/31
Purpose : Write a while loop that outputs numbers from 50 to 100 by 1
*/
public class Count2 {
    public static void main(String[] args) {
        int num1 = 50;

        while (num1 <= 100) // stop when num1 is bigger than 100
        {
            System.out.println(num1);
            num1 = num1 + 1; // after print 100, num1 would be 101, but program dont print it
        }
    }
}