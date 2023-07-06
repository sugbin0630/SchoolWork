package TIP.others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		/*
		 * InputMismatchException - Occurs when you try to read one data type and are
		   given another. 
		 * (For example, expecting an int, but given a string or a decimal number) 
		 * ArrayIndexOutOfBoundsException - Occurs when you try to use
		  an array index that doesnt exist. 
		 * StringIndexOutOfBoundsException - Similar to the above, but for Strings. 
		 * NumberFormatException - Trying to parse a String containing non-numeric data into a number.
		  
	 	try { 
			<Instructions which might cause an exception> 
	  	} catch (<ExceptionType> <ExceptionName>) { 
	  		<How to handle this excpetion type if it happens> 
	  	} catch (<ExceptionType> <ExceptionName>) {
			<How to handle this excpetion type if it happens> 
		}
		 
		 * if they have same Exception type, only first catch would be run
		 */
		Scanner sc = new Scanner(System.in); // Try to trace this program. // What will it do?
		boolean inputValid = false;

		do // do while loop for loop until user enter right data type
		{
			try {
				System.out.print("Please enter a number:  ");
				sc.nextInt();
				System.out.println("Thank you!");
				inputValid = true;
			} catch (InputMismatchException e) // e : exception type name
			{
				System.out.println("\nBad input type:  " + e);
				System.out.println("You must enter an integer to continue.");
				sc.nextLine();
			}
		} while (!inputValid);
		sc.close();
	}
}