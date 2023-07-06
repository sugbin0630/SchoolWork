package Grade11.unit2.HW11_Output;

import java.util.Scanner;

/*
Austin 
2022 3/08
practice if statement
*/
public class If_Note1 {
    public static void main(String[] args) {
        // First way
        double num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Write any number bigger than 7");
        num = sc.nextDouble();

        if (num > 7) {
            System.out.println("true");
        } else if (num <= 7) {
            System.out.println("false");
        }
        // Second way
        double num2;

        System.out.println("Write number smaller than 19");
        num2 = sc.nextDouble();

        boolean if1 = num2 < 19;
        System.out.print(if1);
        sc.close();
    }
}