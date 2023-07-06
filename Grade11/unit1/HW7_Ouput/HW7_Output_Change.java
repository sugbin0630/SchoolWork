package Grade11.unit1.HW7_Ouput;

import java.util.*;

public class HW7_Output_Change
{
   public static void main(String[] args)
   {
      int toonies = 200;
      int loonies = 100;
      int quarters = 25;
      int dimes = 10;
      int nickels = 5;
      
      int amount;
      
      int tooniesLeft;
      int looniesLeft;
      int quartersLeft;
      int dimesLeft;
      int nickelsLeft;

      int finalLeft;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the amout (in cents)");
      amount = sc.nextInt();
      
      tooniesLeft = amount / toonies;
      amount = amount % toonies;
      
      looniesLeft = amount / loonies;
      amount = amount % loonies;
      
      quartersLeft = amount / quarters;
      amount = amount % quarters;
      
      dimesLeft = amount / dimes;
      amount = amount % dimes;
      
      nickelsLeft = amount / nickels;
      amount = amount % nickels;
      
      
      System.out.println("Toonies :" + tooniesLeft);
      System.out.println("Loonies :" + looniesLeft);
      System.out.println("Quarters :" + quartersLeft);
      System.out.println("Dimes :" + dimesLeft);
      System.out.println("Nickels :" + nickelsLeft);
      
      finalLeft = amount % nickels;
      System.out.println("Leftover cents: " + finalLeft);
      sc.close();
   }
}