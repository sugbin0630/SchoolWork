package Grade11.unit1.HW7_Ouput;

import java.util.*;

public class HW7_Output_Spending
{
   public static void main(String[] args)
   {
      double food;
      double clothing;
      double entertainment;
      double rent;
      double total;
      
      Scanner sc = new Scanner(System.in);
      
      
      System.out.println("Enter the amount spent last month on the following item:\n");
      System.out.print("Food: $");
      food = sc.nextDouble();
      
      System.out.print("Clothing: $");
      clothing= sc.nextDouble();
      
      System.out.print("Entertainment: $");
      entertainment = sc.nextDouble();
      
      System.out.print("Rent: $");
      rent = sc.nextDouble();
      
      System.out.printf("Category %15s", "Budget\n");
      
      total = food + clothing + entertainment + rent;
      
      System.out.printf("%-17s%,.2f%s%n","Food" ,food / total * 100 ,"%");
      System.out.printf("%-17s%,.2f%s%n","Clothing" ,clothing / total * 100 ,"%");
      System.out.printf("%-17s%,.2f%s%n","Entertainment" ,entertainment / total * 100 ,"%");
      System.out.printf("%-17s%,.2f%s%n","Rent" ,rent / total *100 ,"%");

      sc.close();
   }
}