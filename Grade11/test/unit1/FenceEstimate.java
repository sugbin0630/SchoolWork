package Grade11.test.unit1;

import java.util.Scanner;

public class FenceEstimate {
	public static void main(String[] args) {
		double length;
		double width;
		double perimeter;
		final double WIRECOST = 24.49;
		final double WOODCOST = 89.99;
		double wire;
		double wood;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter lawn length in meters:   ");
		length = sc.nextDouble();
		System.out.print("Enter lawn width in meters:    ");
		width = sc.nextDouble();

		perimeter = length * 2 + width * 2;
		wire = WIRECOST * perimeter;
		wood = WOODCOST * perimeter;

		System.out.printf("%nTotal perimeter:  %.1f%s%n%n", perimeter, " m");
		System.out.printf("Fence type:%19s%n", "Estimate:");
		System.out.println("==============================");
		System.out.printf("Wire Fence%13s%7.2f%n", "$", wire);
		System.out.printf("Wooden Fence%11s%7.2f", "$", wood);
		// Fence type: Estimate:
		// ==============================
		// Wire Fence $ 920.82
		// Wooden Fence $3383.62

		sc.close();
	}
}