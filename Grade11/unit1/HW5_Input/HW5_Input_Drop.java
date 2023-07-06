package Grade11.unit1.HW5_Input;

import java.util.*;

public class HW5_Input_Drop {
   public static void main(String[] args) {
      double time;
      Scanner sc = new Scanner(System.in);

      System.out.println("Write time");
      time = sc.nextDouble();
      System.out.println(100 - 4.9 * time * time);
      sc.close();
   }
}