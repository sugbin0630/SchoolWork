package Grade11.unit1.HW6_Output;

public class Printf_Test
{
   public static void main(String[] args)
   {
      int posNum = 1234;
      int negNum = -4567;
      System.out.printf("%10d \n", posNum); // "A Space" print blank if num is positive 
      // T.M.I. "%+ s" makes error (put space + togather)
      System.out.printf("%+10d \n", posNum); //"+" add + sign if result is positive
      System.out.printf("%+,010d \n", posNum); //"0" fill space to 0 Ex +00001234 = ^^^^+1234 , 0 doesn't affected by ,
      System.out.printf("%-+10d \n", posNum); 
      System.out.printf("%- 10d \n", posNum); //"-" change squence of width Ex ^^^^hi -> hi^^^^
      
      System.out.printf("%,10d \n", negNum); //"," print , ever thrid dight Ex 10000000 -> 10,000,000
      System.out.printf("%-,10d \n", negNum);
      System.out.printf("%-+,10d \n", negNum); //"+" add - when num is negative
      System.out.printf("%- ,10d \n", negNum);  //"A Space" doesn't make error with -
      
      System.out.printf("I love %-5s%5s%n", "ics", "3u1");
      System.out.printf("The average of this class is %6.2f%n", 67.8);
      System.out.printf("The subtotal is %-5.2f and the total price is %5.2f%n", 2.30, 3.99 );

   }
}