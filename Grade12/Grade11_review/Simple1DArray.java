package Grade12.Grade11_review;

import java.util.*;

/**
 * Simple1DArray
 */
public class Simple1DArray {
    public static void main(String[] args) {
        int[] ary;
        int n;
        int temp;
        int sampleSum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        n = sc.nextInt();

        ary = new int[n];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = 1;
        }

        for (int i = 0; i < ary.length; i++) {
            System.out.print("Enter array[" + i + "]: ");
            n = sc.nextInt();
            ary[i] = n;
        }

        temp = ary[0];
        ary[0] = ary[ary.length - 1];
        ary[ary.length - 1] = temp;

        for (int i = 0; i < ary.length; i++) {
            if (ary[i] > 0) {
                ary[i] *= -1;
            }
            sampleSum += ary[i];
            if (ary[i] % 2 == 0){
                System.out.println(ary[i]);
            }
        }
        System.out.println("sum of the ary: " + sampleSum);

        sc.close();
    }
}
