package TIP.others;

import java.util.*;

public class MultipleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int[][] array2D = { { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 } };
        System.out.print(array2D[num1][num2]);

        array2D = new int[2][1];
        array2D[1][0] = 1;

        System.out.print("\n" + array2D[1][0]);
        sc.close();
    }
}