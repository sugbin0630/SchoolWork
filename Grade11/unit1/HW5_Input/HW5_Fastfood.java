package Grade11.unit1.HW5_Input;

import java.util.*;

public class HW5_Fastfood
{
   public static void main(String[] args)
   {
      double b; //burger
      double f; //fried
      double s; //soda
      double t; //total
      double h; //hst
      double p; //employee pay
      
     
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Write Num of Burger");
      b = sc.nextDouble();
      System.out.println("Write Num of Fries");
      f = sc.nextDouble();
      System.out.println("Write Num of Soda");
      s = sc.nextDouble();
      
      t = 1.69 * b + 1.09 * f + 0.99 * s;
      System.out.println("Total cost: "+ t);
      
      h = t * (13/100.0);
      System.out.println("HST: "+ h);
      
      System.out.println("Final cost: "+ "$" + (t + h));
      
      System.out.println("Write How much do u have");
      p = sc.nextDouble();
      
      System.out.println("I have to give u back: " + "$" + (p - (h + t)));
      sc.close();
   }
}