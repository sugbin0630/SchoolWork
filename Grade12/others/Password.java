package Grade12.others;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Password {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char ans;
      String user_id;
      String pass;
      boolean ansType;
   
      System.out.println("Enter Y for log in\nEnter N for sign up");
      do{
         try {
            ans = sc.nextLine().charAt(0); 
            if (ans == 'y' || ans =='Y'){
               do {
                  System.out.print("Enter user id: ");
                  user_id = sc.nextLine();
                  System.out.print("Enter password: ");
                  pass = sc.nextLine();
                  pass = pass + "//encoded";
                  ansType = true;
               }while (login(user_id, pass) != true);
            }
            else if (ans == 'n' || ans == 'N'){
               do {
                  System.out.print("Enter user id: ");
                  user_id = sc.nextLine();
                  System.out.print("Enter password: ");
                  pass = sc.nextLine();
                  signin(user_id, pass);
                  ansType = true;
               }while (signin(user_id, pass) != true ); 
            }
            else {
               ansType = false;
            }
         } catch (InputMismatchException e) {
            System.out.println("please write right data type");
            ansType = false;
         }
      }while(!ansType);
      sc.close();
   }
   /**
    * @param pass
    * @return String
    * ruturn Transform password
    */
   public static boolean login(String user_id, String pass) {
      String enteredUI;
      String enteredPW;
      try {
         Scanner rd = new Scanner(new File(user_id + ".txt"));
         enteredUI = rd.nextLine();
         enteredPW = rd.nextLine();
         if (user_id == enteredUI && pass + "//encoded" == enteredPW){
            System.out.print("login successful");
            return true;
         }
         else {
            System.out.println("Vailde user id or password\nPlease try again");
            
         }
         rd.close();
         return false;
      } catch (IOException e) {
         System.out.println("Vaild user id or password\nPlease try again");
         return false;
      }
   }
   public static boolean signin(String user_id, String pass) {
      try {
         BufferedWriter wr = new BufferedWriter(new FileWriter(user_id + ".txt"));
         wr.write(user_id);
         wr.newLine();
         wr.write(pass); 
         wr.close();
         return true;
      }catch (IOException e){
         System.out.println("Error! " + e);
         return false;
      }
   }
}
