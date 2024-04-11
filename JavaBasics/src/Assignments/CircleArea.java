package Assignments;   //Area of Circle with human input at the Run time for 10 times

import java.util.Scanner;

public class CircleArea 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        // Loop for 10 times
        for (int i = 1; i <= 10; i++) 
        {
            System.out.print("Enter the radius of the circle for calculation " + i + ": ");
            double radius = scanner.nextDouble();

            // Calculate area
            double area = calculateArea(radius);

            // Display the area
            System.out.println("Area of the circle with radius " + radius + " is: " + area);
        }

        scanner.close();
    }
	// Method to calculate area of a circle
    public static double calculateArea(double radius) 
    {
        return Math.PI * radius * radius;
	}
}
