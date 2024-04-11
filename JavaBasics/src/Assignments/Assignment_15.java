package Assignments; // Assignment_15 - Switch case with the help of scanner class

import java.util.Scanner;

public class Assignment_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                sub();
                break;
            case 3:
                multi();
                break;
            case 4:
                divide();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    static void add() {
        int a = 10;
        int b = 20;
        System.out.println("Addition: " + (a + b));
    }

    static void sub() {
        int a = 10;
        int b = 20;
        System.out.println("Subtraction: " + (a - b));
    }

    static void multi() {
        int a = 10;
        int b = 20;
        System.out.println("Multiplication: " + (a * b));
    }

    static void divide() {
        int a = 10;
        int b = 20;
        System.out.println("Division: " + (a / b));
    }
}
