package Grade12.Grade11_review;

import java.util.*;

/**
 * SortThreeLetters
 */
public class SortThreeLetters {
    public static void main(String[] args) {
        char[] ary = new char[3];
        char swap;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter char1: ");
        ary[0] = sc.nextLine().charAt(0);
        System.out.print("Enter char2: ");
        ary[1] = sc.nextLine().charAt(0);
        System.out.print("Enter char3: ");
        ary[2] = sc.nextLine().charAt(0);

        for (int i = 0; i < ary.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[tmp] >= (ary[j])) {
                    tmp = j;
                }
            }
            swap = ary[i];
            ary[i] = ary[tmp];
            ary[tmp] = swap;
        }
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }
        sc.close();
    }
}