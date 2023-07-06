package Grade11.unit1.HW7_Ouput;

import java.util.*;

public class HW7_Output_Energy
{
   public static void main(String[] args)
   {
      double lightSpeed = 3 * 100000000;
      double mass;
      double energy;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Wright the mass(kg)");
      mass = sc.nextDouble();
      
      energy = mass * lightSpeed * lightSpeed;
      
      System.out.println("You can bright :" + energy + "j");
      sc.close();
   }
}