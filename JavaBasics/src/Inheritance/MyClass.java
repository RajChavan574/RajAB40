package Inheritance;

class GrandParent_Class
{
	GrandParent_Class()
	{
		System.out.println("3");
	}
}
class Parents_Class extends GrandParent_Class
{
	Parents_Class(int a, double b)
	{	
		System.out.println("2");
	}
}
class Child_Class extends Parents_Class
{
	Child_Class()
	{   super(76,9.87);
		System.out.println("1");
	}
}
public class MyClass 
{

	public static void main(String[] args) 
	{
		Child_Class c1 = new Child_Class();
	}

}
