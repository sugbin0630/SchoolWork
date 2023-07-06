package TIP.others;
/*
The Method that made in one class can be used in other class

Math. String. Those are method that someone already made
This time, we will create own method

New Method would be inside of the class, but not in Main Method

Method always start with header
Method has pair of curly brackets{} after header
as loop
EX) public static void main(String[] args) is header of main method

Order of method:
<accessModifier> [methodType] <returnType> <MethodName>([parameters])

accessModifier: Control where the method can be used. use "public" in this course

methodType: Decide the method is static or non-static. To be non-static, leave this blank

returnType: Decide what value the method "return"
return : send the value to outside of the method
To do not return : <returnType> has to be "void"
Use only one "return" for one method

MethodName: Name of method. rule of it is same as variable name

parameters: define which data type expected. we can declare it same as variable
*/
public class Method
{
   //This is Main Method
   /*<accessModifier> [methodType] <returnType> <MethodName>([parameters])
         public          static        void        main    (String[] args)*/
   public static void main(String[] args)
   {
      double a = 0.3;
      System.out.print(sub(a));
   }
   //outside of Main Method
   public static double sub(double a)
   {
      return a*a;
   }
}