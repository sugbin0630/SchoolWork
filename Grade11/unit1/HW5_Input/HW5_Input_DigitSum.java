package Grade11.unit1.HW5_Input;

import java.util.*;

public class HW5_Input_DigitSum {
   public static void main(String[] args) {
      int num;
      int sum;
      int first;
      int second;
      int third;

      Scanner sc = new Scanner(System.in);

      System.out.println("Write any three-digit Number");
      num = sc.nextInt();
      System.out.println("Your Number is: " + num);

      first = num / 100;
      second = num / 10 - first * 10;
      third = num - 100 * first - 10 * second;

      sum = first + second + third;
      System.out.println("sum: " + sum);
      sc.close();
   }
}