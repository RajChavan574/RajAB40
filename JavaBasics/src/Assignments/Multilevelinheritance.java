package Assignments; //Assignment-14 -> create 5 classes for Multilevel Inheritance

class GrandParentClass 
{
    static void fetching_username() 
    {
        System.out.println("Fetching username...");
    }
}

class Parent_Class extends GrandParentClass 
{
    static void login_using_UN() 
    {
        System.out.println("Logging in using username...");
    }
}

class Child_Class1 extends Parent_Class 
{
    static void TestCase1_Adding_product_to_cart() 
    {
        System.out.println("Test Case 1: Adding product to cart...");
    }
}

class Child_Class2 extends Child_Class1 
{
    static void TestCase2_Searching_product() 
    {
        System.out.println("Test Case 2: Searching product...");
    }
}

class Child_Class3 extends Child_Class2 
{
    static void TestCase3_Checkout() 
    {
        System.out.println("Test Case 3: Checkout...");
    }
}

public class Multilevelinheritance extends Child_Class3 {
    public static void main(String[] args) {
        TestCase1_Adding_product_to_cart();
        login_using_UN();
        fetching_username();
        TestCase2_Searching_product();
        TestCase3_Checkout();
    }
}
