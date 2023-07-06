package Grade12.unit2_object.HW19a;

import java.io.*;
import java.util.Scanner;

public class ClosetRunner {
    public static void main(String[] args) {
        String fileName = "boyShirts.txt";
        int maxNum;
        int numOfShirt;
        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader rd = new BufferedReader(new FileReader(fileName));
            maxNum = sc.nextInt();
            numOfShirt = Integer.parseInt(rd.readLine());
            for (int i = 0; i < numOfShirt; i++) {
                new Closet(maxNum, numOfShirt, null);
            }

            rd.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        sc.close();
    }
}
