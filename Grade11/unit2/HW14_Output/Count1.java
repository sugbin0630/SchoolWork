package Grade11.unit2.HW14_Output;

/*
Count1.java
Made by Austin
Made in 2022 03/31
Purpose : Write while loop that outputs numbers from 0 to 50 by 5
*/
public class Count1 {
    public static void main(String[] args) {
        int num1 = 0;

        while (num1 <= 50) // stop when num1 is bigger than 50
        {
            System.out.println(num1);
            num1 = num1 + 5;
        }
    }
}