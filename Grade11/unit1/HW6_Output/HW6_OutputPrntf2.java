package Grade11.unit1.HW6_Output;

/*
HW6_OutputPrntf2
Made by Austin
fixed in 2022 04/08
Purpose :print square of numbers
*/
public class HW6_OutputPrntf2
{
   public static void main(String[] args)
   {
      /*
      Number        Square
      1.10         1.21000
      1.11         1.23210
      1.12         1.25440
      1.13         1.27690
      1.14         1.29960
      1.15         1.32250
      */
      double num = 1.10;
      double sq = num * num;
      
      System.out.println("Number        Square");
      
      System.out.printf("%-13.2f", num);
      System.out.printf("%.5f %n", sq);
      // !!!!! double is not %d
      // ask the calculation in printf

      num = 1.11;
      sq = num * num;
      
      System.out.printf("%-13.2f", num);
      System.out.printf("%.5f %n", sq);
      
      num = 1.12;
      sq = num * num;
      
      System.out.printf("%-13.2f", num);
      System.out.printf("%.5f %n", sq);
      
      num = 1.13;
      sq = num * num;
      
      System.out.printf("%-13.2f", num);
      System.out.printf("%.5f %n", sq);
      
      num = 1.14;
      sq = num * num;
      
      System.out.printf("%-13.2f", num);
      System.out.printf("%.5f %n", sq);
      
      num = 1.15;
      sq = num * num;
      
      System.out.printf("%-13.2f", num);
      System.out.printf("%.5f %n", sq);
      
    }
}