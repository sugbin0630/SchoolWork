package Grade11.unit2.HW11_Output;

import java.util.*;

/*
Austin
2022 3/08
*/
public class If_Note2 {
    public static void main(String[] args) {
        int a;
        int b;
        String x;

        Scanner sc = new Scanner(System.in);

        System.out.print("a : ");
        a = sc.nextInt();
        System.out.print("b : ");
        b = sc.nextInt();

        if (a < 0) {
            System.out.println(a);
        } else if (a > 0) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        /*
         * if : if statment
         * else : start when if is false, doesn't require expression
         * else if : start when if is false, require expression
         * 
         * else also work with else-if statement
         * 
         * expression equal sigh have to be ==
         * 
         * use () when u use && or ||
         * ex) (x > 0) && (x < 0)
         * Opperation order ! -> && -> ||
         * 
         * lets use switch when u use string
         * 
         * format
         * 
         * switch (<selection>)
         * {
         * case <value>:
         * <instructions>
         * [break;]
         * [case <value>:
         * <instructions>
         * [break;]
         * [default:
         * <instructions>
         * [break;]
         * }
         */
        System.out.print("\nx : ");
        x = sc.nextLine();

        switch (x) {
            case "hello":
                System.out.println("Hello");
                break;
            case "hi":
                System.out.println("Hi");
                break;
        }
        sc.close();
    }
}