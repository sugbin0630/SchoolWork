package Grade12.unit2_object.HW18;

import java.util.*;

public class BagTester {

    public static void main(String[] args) {
        int bagId;
        int binderId;
        boolean stop = false;

        Scanner sc = new Scanner(System.in);

        String style1 = "red-bag";
        String style2 = "blue-bag";

        String label1 = "English";
        String label2 = "Math";
        String label3 = "Science";
        String label4 = "Computer";

        String color1 = "Red";
        String color2 = "Blue";
        String color3 = "yellow";
        String color4 = "green";

        Binder b1 = new Binder(label1, color1);
        Binder b2 = new Binder(label2, color2);
        Binder b3 = new Binder(label3, color3);
        Binder b4 = new Binder(label4, color4);
        SchoolBag bag1 = new SchoolBag(style1, b1, b2);
        SchoolBag bag2 = new SchoolBag(style2, b1, b2);
        do {
            System.out.print("\nPlease select a schoolbag (by ID, 0 or 1): ");
            bagId = sc.nextInt();
            if (bagId == 0) {
                System.out.print("Please select a binder in schoolbag (by ID, 0 or 1): ");
                binderId = sc.nextInt();
                if (binderId == 0) {
                    System.out.print("Add (a) or remove (r) sheets: ");
                    sc.nextLine();
                    if (sc.nextLine().charAt(0) == 'a') {
                        System.out.print("# of sheets: ");
                        bag1.addSheet(b1, sc.nextInt());
                    } else if (sc.nextLine().charAt(0) == 'r') {
                        System.out.print("# of sheets: ");
                        bag1.removeSheet(b1, sc.nextInt());
                    }
                } else if (binderId == 1) {
                    System.out.print("Add (a) or remove (r) sheets: ");
                    sc.nextLine();
                    if (sc.nextLine().charAt(0) == 'a') {
                        System.out.print("# of sheets: ");
                        bag1.addSheet(b2, sc.nextInt());
                    } else if (sc.nextLine().charAt(0) == 'r') {
                        System.out.print("# of sheets: ");
                        bag1.removeSheet(b2, sc.nextInt());
                    }
                } else if (binderId != -1) {
                    stop = true;
                }
            } else if (bagId == 1) {
                System.out.print("Please select a binder in schoolbag (by ID, 0 or 1): ");
                binderId = sc.nextInt();
                if (binderId == 0) {
                    System.out.print("Add (a) or remove (r) sheets: ");
                    sc.nextLine();
                    if (sc.nextLine().charAt(0) == 'a') {
                        System.out.print("# of sheets: ");
                        bag2.addSheet(b3, sc.nextInt());
                    } else if (sc.nextLine().charAt(0) == 'r') {
                        System.out.print("# of sheets: ");
                        bag2.removeSheet(b3, sc.nextInt());
                    }
                } else if (binderId == 1) {
                    System.out.print("Add (a) or remove (r) sheets: ");
                    sc.nextLine();
                    if (sc.nextLine().charAt(0) == 'a') {
                        System.out.print("# of sheets: ");
                        bag2.addSheet(b4, sc.nextInt());
                    } else if (sc.nextLine().charAt(0) == 'r') {
                        System.out.print("# of sheets: ");
                        bag2.removeSheet(b4, sc.nextInt());
                    }
                } else if (binderId != -1) {
                    stop = true;
                }
            } else if (bagId == -1) {
                stop = true;
            } else {
                stop = false;
            }

        } while (!stop);
        System.out.print(bag1.toString(0));
        System.out.print(bag2.toString(1));
        sc.close();
    }
}
