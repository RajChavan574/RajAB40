package Inheritance;
class GrandParentClass
{
	static void fetching_username()
	{
		
	}
}
class Parent_Class extends GrandParentClass
{
	static void login_using_UN()
	{
		
	}
}

public class Multi_Level_Inheritance extends Parent_Class
{
	static void TestCase1_Adding_product_to_cart()
	{
		
	}
	public static void main(String[] args) 
	{
		TestCase1_Adding_product_to_cart();
		login_using_UN();
		fetching_username();
	}
}
