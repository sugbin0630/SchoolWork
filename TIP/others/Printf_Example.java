package TIP.others;
public class Printf_Example
{
   public static void main(String[] args)
   {
      double price = 29.95;
      String name = "Austin";
      String stars = "****";
      
      System.out.printf("%s, please pay $%.2f %n", name, price);
      System.out.printf("%s! MONEY ME! NOW! %n", name);
      System.out.printf("%s \n", stars);
   }
}