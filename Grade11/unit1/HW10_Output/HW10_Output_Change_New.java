package Grade11.unit1.HW10_Output;

import java.util.*;

public class HW10_Output_Change_New
{
   public static void main(String[] args)
   {
      final int TOONIES = 200;
      final int LOONIES = 100;
      final int QUARTERS = 25;
      final int DIMES = 10;
      final int NICKELS = 5;
      final int PENNIES = 1;  
      
      int tooniesAmount;
      int looniesAmount;
      int quartersAmount;
      int dimesAmount;
      int nickelsAmount;
      int penniesAmount;
      
      int left;

      
      double dollar;
      int dollarInt;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Write Your Dollar\n$");
      dollar = sc.nextDouble();
      
      dollarInt = (int) (dollar * 100);
      
      tooniesAmount = dollarInt / TOONIES;
      left = dollarInt % TOONIES;
      
      looniesAmount = left / LOONIES;
      left = left % LOONIES;
      
      quartersAmount = left / QUARTERS;
      left = left % QUARTERS;
      
      dimesAmount = left / DIMES;
      left = left % DIMES;
      
      nickelsAmount = left / NICKELS;
      left = left % NICKELS;
      
      penniesAmount = left / PENNIES;
      left = left % PENNIES;
      
      System.out.println("Toonies:" + tooniesAmount);
      System.out.println("Loonies:" + looniesAmount);
      System.out.println("Quarters:" + quartersAmount);
      System.out.println("Dimes:" + dimesAmount);
      System.out.println("Nickels:" + nickelsAmount);
      System.out.println("Pennies:" + penniesAmount);
      sc.close();
   }
}