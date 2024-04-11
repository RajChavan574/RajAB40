package Assignments;

import java.util.Scanner;

public class CircleCircumference 
{
    // Declaring pi as a global constant
    public static final double pi = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * pi * radius;

        System.out.println("The circumference of the circle is: " + circumference);

        // Don't forget to close the scanner
        scanner.close();
    }
}
