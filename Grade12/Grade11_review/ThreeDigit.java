package Grade12.Grade11_review;

import java.util.*;

public class ThreeDigit {
    public static void main(String[] args) {
        int num;
        int fNum;
        int sNum;
        int tNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three-digit: ");
        num = sc.nextInt();

        fNum = num / 100;
        sNum = num / 10 - fNum * 10;
        tNum = num -fNum * 100 - sNum * 10;

        System.out.println("Sum of three-digit number: " + fNum + sNum + tNum);
        sc.close();
    }
}
