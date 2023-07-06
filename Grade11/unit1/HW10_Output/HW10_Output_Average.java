package Grade11.unit1.HW10_Output;

import java.util.Scanner;

public class HW10_Output_Average {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		double average;

		Scanner sc = new Scanner(System.in);

		System.out.println("Wirte 5 int numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		average = ((double) num1 + (double) num2 + (double) num3 + (double) num4 + (double) num5) / 5;

		System.out.printf("Your average number is : %.1f", average);
		sc.close();
	}
}