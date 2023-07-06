package Grade11.unit1.HW5_Input;

import java.util.*;

public class HW5_Input_Alive
{
   public static void main(String[] args0)
   {
      int b_years;
      int b_month;
      int b_day;
      
      int n_years;
      int n_month;
      int n_day;
      
      int alive;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Your BirthDate");
      System.out.println("Year: ");
      b_years = sc.nextInt();
      
      System.out.println("Month :");
      b_month = sc.nextInt();
      
      System.out.println("Day: ");
      b_day = sc.nextInt();
      
      System.out.println("Enter Today's Date");
      System.out.println("Year: ");
      n_years = sc.nextInt();
      
      System.out.println("Month :");
      n_month = sc.nextInt();
      
      System.out.println("Day: ");
      n_day = sc.nextInt();
      
      alive = (n_years - b_years) * 365 +(n_month - b_month) * 30 +(n_day - b_day);
      System.out.println("You Have Been Alive For "+ alive + "days");
      System.out.println("You Have Been Slept "+ alive * 8 + "hours");
      sc.close();
   }
}