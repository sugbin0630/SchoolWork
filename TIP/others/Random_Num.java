package TIP.others;
public class Random_Num
{
   public static void main(String[] args)
   {
      int a = (int)((Math.random() * 100) + 1);
      System.out.print(a);
      
      /*
      '' is not part of the code
      Variable = (variable type) ( ( Math.random() * 'length of number + 1' ) + 'minium number of the length');
                                 ^ ^                                       ^                                ^
                                 1 2                                       2                                1
      EX
      a = (int)((Math.random() * 101) + 1 );
      a is random number between 1 to 100
      */
   }
}