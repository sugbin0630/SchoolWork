package Grade11.unit1.HW9_Output;

import java.util.*;

public class HW9_Output_Height
{
   public static void main(String[] args)
   {
      double inches;
      double cm;
      final double itc = 2.54; //inches to cm
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Write height(inches) :");
      inches = sc.nextDouble();
      
      cm = itc * inches;
      System.out.printf("Height is :%,.1fcm", cm);
      sc.close();
   }
}