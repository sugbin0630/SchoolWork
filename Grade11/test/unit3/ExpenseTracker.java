package Grade11.test.unit3;

import java.util.*;
import java.io.*;

/*
ExpenseTracker.java
Made by Austin
Made in 2022 06/15
Purpose : read requirment
*/
public class ExpenseTracker {
	public static void main(String[] args) {
		String fileName;
		int ans;
		boolean rightAns;
		boolean end = false;

		Scanner sc = new Scanner(System.in);

		do { // loop until end
			do { // repit when worng ans
				rightAns = false; // reset
				try {
					System.out.println("1 - Create expense file");
					System.out.println("2 - Print expense file");
					System.out.println("3 - Quit");
					System.out.print("\nWhat would you like to do?  ");
					ans = sc.nextInt();
					System.out.print("\n");
					sc.nextLine(); // bug fix

					switch (ans) {
					case 1:
						rightAns = true;
						System.out.print("What filename would you like to use for this expense report?  ");
						fileName = sc.nextLine();
						System.out.print("\n");
						newExpenses(fileName);
						newBudget(fileName);
						break;
					case 2:
						rightAns = true;
						System.out.print("Which expense report would you like to print?  ");
						fileName = sc.nextLine();
						if (printExpenses(fileName) != true) {
							System.out.println("File not founded\n");
						}
						// method will print error, so we dont need else
						break;
					case 3:
						rightAns = true;
						end = true;
						System.out.print("Program ending!");
						break;
					default:
						System.out.print("Please Write right answer\n");
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Please write integer");
					sc.nextLine(); // bug fix
					ans = 0;// reset
				}
			} while (rightAns != true);
		} while (end != true); // loop until Quit
		sc.close();
	}

	/*
	newExpenses void
	Parameter : fileName
	Purpose : create new file
	*/
	public static void newExpenses(String fileName) //reason of bug
   {
      Scanner sc = new Scanner(System.in);
      double total = 0;
      String category;
      String s;
      try {
         BufferedWriter wr = new BufferedWriter(new FileWriter(fileName + ".txt"));
         System.out.println("\nEnter a category or expense (type \"exit\" to end)");
         category = sc.nextLine();
         do {
            s = sc.nextLine();
            wr.write(s);
            wr.newLine();

            try {
                Double.parseDouble(s);
                total += Integer.parseInt(s);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(category + " category ended, total : " + "$" + total);
               category = s;
               System.out.println("Please enter " + category + " expenses : ");
            }
         }while (s.equals("exit") != true);
         
         wr.close();
      }
      catch (IOException e){
         System.out.print("Error!\nError type : " + e);
      }
      sc.close();
   }

	/*
	newBudget void
	Parametar : fileName
	Purpose : eddit file
	*/
	public static void newBudget(String fileName) {
		try {
			BufferedWriter wr = new BufferedWriter(new FileWriter(fileName + ".txt"));

			wr.close();
		} catch (IOException e) {
			System.out.print("Error!\nError type : " + e);
		}
	}

	/*
	printExpenses boolean
	true: work nicely
	false: error
	Parameter : fileName
	Purpose : print file info
	*/
	public static boolean printExpenses(String fileName) {
		boolean work;
		String reading;
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName + ".txt"));

			System.out.println("Printing " + fileName + ".txt");
			reading = rd.readLine();
			while (reading != null) {
				System.out.println(reading);
				reading = rd.readLine();
			}
			System.out.println("");
			rd.close();
			work = true;
		} catch (IOException e) {
			work = false;
		}
		return work;
	}
}