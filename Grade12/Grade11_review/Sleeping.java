package Grade12.Grade11_review;

import java.util.Scanner;

public class Sleeping {
    public static void main(String[] args) {
        int bYear;
        int bMonth;
        int bDay;
        int tYear;
        int tMonth;
        int tDay;
        int dayAlive;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your brithdate");
        System.out.print("Year: ");
        bYear = sc.nextInt();
        System.out.print("Month: ");
        bMonth = sc.nextInt();
        System.out.print("Day: ");
        bDay = sc.nextInt();

        System.out.println("Enter today's date");
        System.out.print("Year: ");
        tYear = sc.nextInt();
        System.out.print("Month: ");
        tMonth = sc.nextInt();
        System.out.print("Day: ");
        tDay = sc.nextInt();

        dayAlive = (tYear - bYear) * 365 + (tMonth - bMonth) * 30 + (tDay - bDay);

        System.out.println("You have been alive for " + dayAlive + " days.\nYou have slept " + dayAlive * 8 + " hours.");
        sc.close();
    }
}
