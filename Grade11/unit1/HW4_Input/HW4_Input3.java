package Grade11.unit1.HW4_Input;

import java.util.*;
/*
HW4_Input2.java
Made by Austin
Fixed in 2022 04/08
Purpose ask user's age and print it
*/
public class HW4_Input3
{
   public static void main(String[] args)
   {
      //variable
      String name;
      int age;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("What's your name?");
      name = sc.nextLine();
      
      System.out.println("How old are you?");
      age = sc.nextInt();
      
      System.out.println("So you are "+ name +" and you are "+ age);
      sc.close();
   }
}