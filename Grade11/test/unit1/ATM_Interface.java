package Grade11.test.unit1;

import java.util.Scanner;

public class ATM_Interface {
	public static void main(String[] args) {
		int amount;
		int twoBills;
		int fiveBills;
		int twoBillsLeft;
		int fiveBillsLeft;

		Scanner sc = new Scanner(System.in);

		System.out.println("==================================================");
		System.out.println("|| // \\\\ //  \"MONEY TIME ATM SERVICE\"  \\\\ // \\\\ ||");
		System.out.println("==================================================\n");
		System.out.print("Amount (in $) to withdraw: ");
		amount = sc.nextInt();

		System.out.println("\nTo get $" + amount + ", you could receive: ");
		twoBills = amount / 20;
		twoBillsLeft = amount % 20;

		fiveBills = amount / 50;
		fiveBillsLeft = amount % 50;

		System.out.println(twoBills + "x $20 bills, with $" + twoBillsLeft + " left over");
		System.out.println("OR");
		System.out.println(fiveBills + "x $50 bills, with $" + fiveBillsLeft + " left over");
		sc.close();
	}
}