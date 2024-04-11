package Assignments;

import java.util.Scanner;

public class CircumferenceOfCircle 
{
	// Global variable for pi
    public static final double PI = 3.14159;

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = calculateCircumference(radius);
        System.out.println("Circumference of the circle: " + circumference);

        scanner.close();
	}
	// Method to calculate circumference
    public static double calculateCircumference(double radius) 
    {
        return 2 * PI * radius;
    }
}
