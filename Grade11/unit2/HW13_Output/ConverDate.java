package Grade11.unit2.HW13_Output;

import java.util.*;

/*
ConverDate.java
Made by Austin
Made in 2022 03/29
Purpose : ask year, month, date to user and list those
possible to user B.C. in year
Error! when month or date is < 1
*/
public class ConverDate {
    public static void main(String[] args) {
        int year;
        int month;
        int date;
        Scanner sc = new Scanner(System.in);

        System.out.print("Year : ");
        year = sc.nextInt();
        System.out.print("Mounth(number) : ");
        month = sc.nextInt();
        System.out.print("Date : ");
        date = sc.nextInt();

        System.out.print("\n");

        // month, date cant be negative!
        if (month >= 1 && date >= 1) {
            switch (month) {
                case 1:
                    System.out.print("January");
                    break;
                case 2:
                    System.out.print("February");
                    break;
                case 3:
                    System.out.print("March");
                    break;
                case 4:
                    System.out.print("April");
                    break;
                case 5:
                    System.out.print("May");
                    break;
                case 6:
                    System.out.print("June");
                    break;
                case 7:
                    System.out.print("July");
                    break;
                case 8:
                    System.out.print("August");
                    break;
                case 9:
                    System.out.print("September");
                    break;
                case 10:
                    System.out.print("October");
                    break;
                case 11:
                    System.out.print("November");
                    break;
                case 12:
                    System.out.print("December");
                    break;
            }
            // B.C.
            if (year < 0) {
                year = year * -1;
                System.out.print(" " + date + ", B.C." + year);
            } else {
                System.out.print(" " + date + ", " + year);
            }
        } else {
            System.out.print("Error!");
        }
        sc.close();
    }
}