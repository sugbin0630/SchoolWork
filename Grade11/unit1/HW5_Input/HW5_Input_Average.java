package Grade11.unit1.HW5_Input;

import java.util.*;

public class HW5_Input_Average {
   public static void main(String[] args) {
      double number1;
      double number2;
      double number3;

      Scanner sc = new Scanner(System.in);
      System.out.println("Write Three Number");
      number1 = sc.nextDouble();
      number2 = sc.nextDouble();
      number3 = sc.nextDouble();

      System.out.print((number1 + number2 + number3) / 3);
      sc.close();
   }
}