package Grade12.unit2_object.HW17;

import java.util.*;

public class PantryTester {
    public static void main(String[] args) {
        int id;
        boolean stop;
        int amount;

        Scanner sc = new Scanner(System.in);

        Jam j1 = new Jam("Gooseberry", "7/4/86", 12);
        Jam j2 = new Jam("Crab Apple", "9/30/99", 8);
        Jam j3 = new Jam("Rhubarb", "10/31/99", 16);
        Pantry p = new Pantry(j1, j2, j3);

        System.out.println("Welcome to Mother Hubbard's Pantry!\n");
        do {
            stop = false;
            System.out.println("The jams are:");
            System.out.println(p);
            System.out.println("Enter your selection (1, 2, or 3): ");
            id = sc.nextInt();
            if (id == 1) {
                System.out.println("Enter amount to spread: ");
                amount = sc.nextInt();
                if (j1.isEmpty()) {
                    System.out.println("No jam in the Jar!");
                } else {
                    p.removeJam(j1, amount);
                }
            } else if (id == 2) {
                System.out.println("Enter amount to spread: ");
                amount = sc.nextInt();
                if (j2.isEmpty()) {
                    System.out.println("No jam in the Jar!");
                } else {
                    p.removeJam(j2, amount);
                }
            } else if (id == 3) {
                System.out.println("Enter amount to spread: ");
                amount = sc.nextInt();
                if (j3.isEmpty()) {
                    System.out.println("No jam in the Jar!");
                } else {
                    p.removeJam(j3, amount);
                }
            } else if (id == -1) {
                stop = true;
                System.out.println("Good-Bye");
            } else {
                System.out.println("Out-of-range Error!\nPlease try again");
            }
        } while (!stop);
        sc.close();
    }
}
