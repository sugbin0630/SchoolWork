package Grade11.unit1.HW9_Output;

import java.util.*;

public class HW9_Output_Currency
{
   public static void main(String[] args)
   {
      double usm; //U.S money
      double cnm; //CN money
      final double CURRENCY = 1.29;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Wirte your dollar money :\n$");
      usm = sc.nextDouble();
      
      cnm = usm * CURRENCY;
      System.out.printf("Currency is : $%,.2f", cnm);
      sc.close();
   }
}