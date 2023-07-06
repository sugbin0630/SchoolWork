package Grade11.unit1.HW5_Input;

import java.util.*;

public class HW5_Input_PizzaCost {
   public static void main(String[] args) {
      double cost;
      Scanner sc = new Scanner(System.in);

      System.out.println("Write Pizza Diameter(inches)");
      cost = sc.nextDouble();
      cost = cost * cost * 0.05 + 1.75;
      System.out.println("$" + cost);
      sc.close();
   }
}