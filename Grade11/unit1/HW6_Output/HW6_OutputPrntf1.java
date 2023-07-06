package Grade11.unit1.HW6_Output;

/*
HW6_OutputPrntf1.java
Made by Austin
fixed in 2022 04/08
Purpose : Use printf
*/
public class HW6_OutputPrntf1
{
   public static void main(String[] args)
   {
      String name = "Juanita";
      double number = 2345678.99;
      
      System.out.printf("%s's bank account balance is $%,.2f.%n", name, number);
      
      name = "Juan";
      number = 15455.26;
      
      System.out.printf("%7s's bank account balance is $%,12.2f.%n", name, number);
      
      /*%[flags][width][.decimalPlaces]<dataType>
      EX) ("%+10.7s \n", <variable>, or <text>);
      
      % is start of command
      + is flag (change form of width)
      10 is width (minimum width that java will print)
      .7 is width of dicimal point that java will print
      s is DataType (String)
      
      \n is next line %n can replace it
      */
   }
}