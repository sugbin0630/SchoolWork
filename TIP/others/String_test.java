package TIP.others;
import java.util.*;
//String is class!
public class String_test
{
   public static void main(String[] args)
   {
      /*
      String is class, so we can use it in code
      Most of String class is non-static method
      String has lots of useful functions about letter
      EX) (str1 == str2)
          =
          str1.equals(str2)
          it will give "true" value if they are same
          
      */
      
      Scanner sc = new Scanner(System.in);
      String str1, str2;
      
      str1 = sc.nextLine();
      str2 = sc.nextLine();
      
      System.out.println(str1.equals(str2)); //output true if str1, str2 are same
      System.out.println(str1.compareTo(str2)); //output positive if str1 > str2, negative if str1 < str2
      System.out.println(str1.length()); //output length of input
      System.out.println(str1.charAt(0)); //output the letter that has same index with input (start with 0)
      System.out.println(str1.substring(0, 2)); //output the letter between start int and end int
      //variableName.substring(<start int>, <end int>);
      System.out.println(str1.equalsIgnoreCase(str2)); //treat Upper-case = lower-case
      System.out.println(str1.compareToIgnoreCase(str2)); //"
      //Static method
      System.out.println("Static:");
      System.out.println(Integer.parseInt(str1)); //turn string into int
      System.out.println(Double.parseDouble(str1)); //turn string into double
   sc.close();
   }
}