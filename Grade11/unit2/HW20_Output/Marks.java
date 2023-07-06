package Grade11.unit2.HW20_Output;

import java.util.*;

/*
Marks.java
Made by Austin
Made in 2022 04/25
Purpose : ask 4 name and their mark, ask mark and print the name who got same mark
*/
public class Marks {
    public static void main(String[] args) {
        // Arrays
        String[] name;
        name = new String[4];
        int[] mark;
        mark = new int[4];
        // Variable
        int userMark;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and mark\n");

        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter mark: ");
            mark[i] = sc.nextInt();
            while (mark[i] > 100 || mark[i] < 0) {
                System.out.println("\nEnter 100 to 0");
                System.out.print("Enter mark: ");
                mark[i] = sc.nextInt();
            }
            sc.nextLine(); // it erase enter
            System.out.println("");
        }

        System.out.print("Enter the mark for searching: ");
        userMark = sc.nextInt();

        for (int i = 0; i < mark.length; i++) {
            if (userMark == mark[i]) {
                if (num > 0) {
                    System.out.print(", " + name[i]);
                } else {
                    System.out.print(name[i]);
                    num++;
                }
            } else {
                System.out.print("Not found");
            }
        }
        sc.close();
    }
}