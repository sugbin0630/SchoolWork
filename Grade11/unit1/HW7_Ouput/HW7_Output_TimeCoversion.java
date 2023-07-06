package Grade11.unit1.HW7_Ouput;

import java.util.*;

public class HW7_Output_TimeCoversion
{
   public static void main(String[] args)
   {
      
      int time;
      int hour = 60;
      int n_hour;
      int n_min;
      Scanner sc = new Scanner(System.in);
      
      
      System.out.println("What time is it now? (min)");
      time = sc.nextInt();
      
      n_hour = time / hour;
      n_min = time % hour;
      
      System.out.printf("It is %01d:%02d o'clock", n_hour, n_min);
      sc.close();
   }
}