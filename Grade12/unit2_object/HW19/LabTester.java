package Grade12.unit2_object.HW19;

import java.io.*;
import java.util.*;

public class LabTester {
    public static void main(String[] args) {
        String fileName = "computer.txt";
        String selected_manufactrer;
        int maxCapacity;
        int capacity;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maximum capacity of the lab: ");
        maxCapacity = sc.nextInt();
        Lab lab = new Lab(maxCapacity);
        try {
            BufferedReader rd = new BufferedReader(new FileReader(fileName));
            capacity = Integer.parseInt(rd.readLine());

            for (int i = 0; i < capacity; i++) {
                lab.installComputer(capacity, rd.readLine(), rd.readLine(), Integer.parseInt(rd.readLine()),
                        Integer.parseInt(rd.readLine()), Double.parseDouble(rd.readLine()),
                        Integer.parseInt(rd.readLine()), Integer.parseInt(rd.readLine()));
            }
            rd.close();
        } catch (IOException e) {
            System.out.println("Error!\nerror type: " + e);
        }
        System.out.println("Average age: " + lab.averageAge());
        System.out.println("Newest computer\n" + lab.newest().toString() + "\n");
        System.out.println("Fastest computer\n" + lab.fastest().toString());
        if (lab.fastest() == lab.largest()) {
            System.out.println("this computer has largest RAM\n");
        } else {
            System.out.println();
        }
        System.out.println("Select manufacturer: ");
        sc.nextLine();
        selected_manufactrer = sc.nextLine();
        System.out.println(
                "Number of " + selected_manufactrer + " computers: " + lab.sameManufacturer(selected_manufactrer));
        if (lab.sameManufacturer(selected_manufactrer) != 0) {
            System.out.println("Serial numbers of the computer expiring next year");
            for (int i = 0; i < lab.expiringComputers().length; i++) {
                System.out.println((i + 1) + ". " + lab.expiringComputers()[i].getSerialNum());
            }
        }
        sc.close();
        /*
         * c. Output average age of the computers in the lab
         * d. Output the spec of the newest computer
         * e. Output the spec of the faster computer (highest speed), and indicate if
         * it has the largest size of RAM
         * f. Ask user for a particular manufacturer, and output the number of
         * computers with the manufacturer.
         * g. Output the serial number of all the computers that are expiring in the
         * next year.
         */
    }
}