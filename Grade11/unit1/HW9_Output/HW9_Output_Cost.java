package Grade11.unit1.HW9_Output;

import java.util.*;
/*
HW9_Output_Cost.java
Made by Austin
Fixed in 2022 04/08
Purpose : ask cost and bag number, print Final cost
*/
public class HW9_Output_Cost
{
   public static void main(String[] args)
   {
      double cost;
      final double HST = 0.13;
      double fcost; //final cost
      double b_num; //bag number
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Write your cost :\n$");
      cost = sc.nextDouble();
      System.out.print("Write your plastic bag :\n");
      b_num = sc.nextDouble();
      
      fcost = cost + cost * HST + b_num * 0.05;
      
      System.out.printf("Your HST is :$%,.2f%n", cost * HST);
      System.out.printf("Your bag cost is :$%,.2f%n", b_num * 0.05);
      System.out.printf("Your Total cost + bag cost is :$%,.2f%n", fcost);
      sc.close();
   }
}