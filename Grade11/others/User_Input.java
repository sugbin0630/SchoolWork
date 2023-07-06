package Grade11.others;

import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {
		String text;
		int wholeNumber;
		double fpNumber;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter \"text\"");
		text = sc.nextLine();

		System.out.println("Please enter \"wholeNumber\"");
		wholeNumber = sc.nextInt();

		System.out.println("Please enter \"fpNumber\"");
		fpNumber = sc.nextDouble();

		System.out.print(text + "\n" + wholeNumber + "\n" + fpNumber);
		sc.close();
	}

}