package Grade11.unit1.HW4_Input;

import java.util.*;
/*
HW4_Input2.java
Made by Austin
Fixed in 2022 04/08
Purpose ask user's name and say hello
*/
public class HW4_Input2
{
   public static void main(String[] args)
   {
      String name; //variable
      
      Scanner text = new Scanner(System.in);
      
      System.out.println("What's your name?");
      name = text.nextLine();
      System.out.println("Hello "+ name);
      text.close();
   }
}