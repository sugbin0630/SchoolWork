package Grade11.unit1.HW10_Output;

public class HW10_Output_Casting {
   public static void main(String[] args) {
      int i1 = 5; // ok; default type for non-decimal is int
      // int i2 = 5.2; //error because int can not be decimal point int

      float f1 = 2; // ok created float variable that�s named f1, and value is 2.0
      float f2 = 3.0f; // ok; f signifies to interpret as float
      // created float variable that�s named f2, and value is 3.0, putted f because
      // used decimal point

      // float f2 = 3.0; //error because used decimal point without f
      // float f3 = 3.5; //error because used decimal point without f

      double d1 = 3.5; // ok; default type for decimal is double
      double d2 = 2.0; // ok
      double d3 = 4; // ok
      double d4 = 3.5d; // ok; d signifies to interpret as double

      i1 = (int) d1; // explicit casting of a double into an int
      System.out.println("i = " + i1); // prints i = 3

      // i1 = 5.0 / 9.0; //error because float can�t be automatically // converted to
      // int
      i1 = 5 / 9; // division of integers yields integer
      System.out.println("i = " + i1); // prints i = 0

      f1 = (float) d1; // explicit casting of a double into an float
      System.out.println("f = " + f1); // print f = 3.5

      f1 = 5 / 9;
      System.out.println("f = " + f1);
      // f1 = 5.0/9.0;
      // error because f1 is float, float need f at the end of decimal point

      f2 = 5.0f / 9.0f;
      System.out.println("f = " + f2);

      d1 = 3.5 / 2.6;
      System.out.println("d = " + d1);

      d2 = (int) 3.5 / 2.6;
      System.out.println("d = " + d2);

      d3 = (int) (3.5) / 2.6;
      System.out.println("d = " + d3);

      d4 = (int) (3.5 / 2.6);
      System.out.println("d = " + d4);

      // d1 = int 3.5 / 2.6; // error because didn�t used () between int

      d1 = (int) (3.5 / 2.6);
      System.out.println("d = " + d1);

      d1 = 3.5 / (int) 2.6;
      System.out.println("d = " + d1);

      d1 = (float) (int) (3.5 / 2.6);
      System.out.println("d = " + d1);

      short smallValue = 45;
      // short s = 3.5; // error because
      // smallValue = 234251434324324; //error because...

      int littleValue = smallValue;

      smallValue = (short) littleValue;
      System.out.println("smallValue = " + smallValue);
      smallValue = (short) 234251434;
      System.out.println("smallValue = " + smallValue);

      // int over = 1111111111111; //error because it is over 10th digit number
      
   }
}