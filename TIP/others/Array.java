package TIP.others;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		// do this later int[] values = {5, 10, -3, 22};
		int userNum;
		// <Data Type>[]<Array Name>;
		// <Array Name> = new <Data Type><[size]>;
		int[] array;
		// First index of array is 0
		// EX) for (int i = 0)
		// Largest index is .length -1
		int arrayLength;
		// then this Array have 10 variables
		int num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Index length: ");
		arrayLength = sc.nextInt();

		// initialize array
		array = new int[arrayLength];

		System.out.print("Array Index: ");
		userNum = sc.nextInt();

		for (int i = 1; i < array.length; i++)
		// i < .length NOT i <= .length
		{
			array[i] = num += 2;
		}
		System.out.println("Index length: " + array.length);
		// we can see index of array to put .length at the end of array
		System.out.println("Index value: " + array[userNum]);
		sc.close();
	}
}