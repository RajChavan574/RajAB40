package Assignments;

public class Assignment_04

{
    Assignment_04() 
    {
        System.out.println("This is my constructor");
    }

    // Static methods
    public static void SM1() 
    {
    	int a=10;
    	int b=20;
        System.out.println("This is static method 1:" +(a+b));
    }

    public static void SM2() 
    {
    	int a=10;
    	int b=20;
        System.out.println("This is static method 2:"+(a-b));
    }

    public static void SM3() 
    {
    	int a=10;
    	int b=20;
        System.out.println("This is static method 3:"+(a*b));
    }

    public static void SM4() 
    {
    	int a=10;
    	int b=20;
        System.out.println("This is static method 4:"+(a/b));
    }

    public static void SM5() 
    {
    	int a=10;
    	int b=20;
        System.out.println("This is static method 5:"+(a+b-a));
    }

    // Non-static methods
    public void NSM1() 
    {
        System.out.println("This is non-static method 1");
    }

    public void NSM2() 
    {
        System.out.println("This is non-static method 2");
    }

    public void NSM3() 
    {
        System.out.println("This is non-static method 3");
    }

    public void NSM4() 
    {
        System.out.println("This is non-static method 4");
    }

    public void NSM5() 
    {
        System.out.println("This is non-static method 5");
    }

    public static void main(String[] args) 
    {
        Assignment_04 c1 = new Assignment_04(); // creating an object of the class

        // Calling static methods
        SM1();
        SM2();
        SM3();
        SM4();
        SM5();

        // Calling non-static methods through the object
        c1.NSM1();
        c1.NSM2();
        c1.NSM3();
        c1.NSM4();
        c1.NSM5();
    }
}