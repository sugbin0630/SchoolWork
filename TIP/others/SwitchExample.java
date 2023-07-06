package TIP.others;
import java.util.*;

public class SwitchExample
{
   public static void main(String[] args)
   {
      // Variable declaration and Scanner creation
      String choice;
      Scanner sc = new Scanner(System.in);
      
      // Prompt the user to input text
      System.out.println("Is pineapple an acceptable pizza topping?");
      System.out.print("Your choices are yes, no or maybe.\n >  ");
      choice = sc.nextLine();
      
      // Switch statement will print an answer based on user choice.
      switch (choice)
      {
         case "yes":
            System.out.println("It's fruit!  That makes the pizza count as health food, right?");
            break;            
         case "maybe":
            System.out.println("Hey.  No.  You have to pick a side on this.");
            break;
         case "no":
            System.out.println("Sweet stuff on a pizza?  Gross!");
            break;
         default:
            System.out.println("Woah, hey.  Don't get all fancy on me.");
            break;
      }
      System.out.println("Program done!");
   sc.close();
   }
}