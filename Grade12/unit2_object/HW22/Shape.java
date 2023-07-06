package Grade12.unit2_object.HW22;

import java.util.*;

public abstract class Shape {
    public static void main(String[] args) {
        int line1, line2, line3, length, width;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = sc.nextInt();

        Rectangle r = new Rectangle(length, width);
        System.out.println("area: " + r.area() + ", parameter: " + r.parameter());

        System.out.print("\nEnter length of square: ");
        length = sc.nextInt();

        Square s = new Square(length);
        System.out.println("area: " + s.area() + ", parameter: " + s.parameter());

        System.out.print("\nEnter line1 of triangle: ");
        line1 = sc.nextInt();
        System.out.print("Enter line2 of triangle: ");
        line2 = sc.nextInt();
        System.out.print("Enter line3 of triangle: ");
        line3 = sc.nextInt();

        Triangle t = new Triangle(line1, line2, line3);
        System.out.println("area: " + t.area() + ", parameter: " + t.parameter());

        sc.close();
    }

    public abstract double area();

    public abstract double parameter();
}

/*
 * 1. Write a set of classes that could be used to do simple calculations on
 * geometric objects. The set should include the following classes
 * a) Shape, containing abstract methods area and perimeter
 */