package Grade11.unit1.HW4_Input;

import java.util.*;
/*
HW4_Input4.java
Made by Austin
Fixed in 2022 04/08
Purpose : allow user write two number, and print it
*/
public class HW4_Input4
{
   public static void main(String[] args)
   {
      //variable
      String text1;
      String text2;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please enter word #1");
      text1 = sc.nextLine();
      System.out.println("Please enter word #2");
      text2 = sc.nextLine();
      
      System.out.println(text1);
      System.out.println(text2);
      System.out.print(text1 +"\t"+ text2);
      sc.close();
   }
}