package TIP.others;
import java.util.*;
public class Loop
{
   public static void main(String[] args)
   {
      int code;
      int num1 = 1;
      int num2 = 2;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter code : ");
      code = sc.nextInt();
      
      while (code == 1) //loop when <condition> is true, skip when false
      {
         System.out.print("while loop");
         code = 0; //stop the loop
      }
      
      if (code == 2) //because it "always" print their structure even <condition> is false
      {
         do //start <instructure> first, and loop when <condition is true>
         {
            System.out.print("do-while loop");
            code = 0;
         } while (code == 2); //semi colon!!
      }
      
      //increment
      num1++; //num1 = num1 + 1;
      //decrement
      num1--; // num1 = num1 - 1;
      
      num1 += num2; //num1 = num1 + num2;
      num1 -= num2; //num1 = num1 - num2;
      
      /*
      for (<counter>; <condition>; <counterUpdate>)
         counter: put new variable to record counting
         condition: generaly, we put counter variable in this space
         counterUpdate: put your expected change of <counter> ex) counter++
      {
         <instruction>
      }
      */
      for (int i = 1; i <= 3 && code == 3; i += 1) //this loop sometimes called "counting loop". it count how many times looped
      //generally, use 'i' for the variable of counter, or 'j', 'k', ect.
      //counter variable will delete when for-loop finish, so we can use same variable again
      {
         System.out.print("for loop\n");
         System.out.println(i + " times looped");
         code = 3;
         if (i == 3)
         {
            code = 0;
            System.out.println("code = " + code);
            System.out.println(num1 + " " + num2);
         }
      }
      sc.close();
   }
}