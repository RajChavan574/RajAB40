package Assignments;

import java.util.Scanner;

public class AreaOfCircle 
{

    // Global & Final variable for pi
	
    static final double pi = 3.14159;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

        double area = calculateArea(radius);

        System.out.println("Area of the circle: " + area);

        scanner.close();
    }

    // Method to calculate area using static variable for pi
    
    static double calculateArea(int radius) 
    {
        return pi * radius * radius;
    }
}

