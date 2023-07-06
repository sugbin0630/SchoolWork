package Grade11.unit1.HW7_Ouput;

import java.util.*;

public class HW7_Output_SimpleInterestPrincipal
{
   public static void main(String[] args)
   {
      double amount;
      double principal;
      int year;
      double rate;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Wirght your Amount:");
      amount = sc.nextDouble();
      
      System.out.println("Wirght years:");
      year = sc.nextInt();
      
      System.out.println("Wirght your interest rate:");
      rate = sc.nextDouble();
      
      principal = amount / (1 + year * rate / 100);
      
      System.out.println("Your Principal have to be :" + principal + "$");
      sc.close();
   }
}