package Inheritance;
//static methods and non-static methods
//no constructors

class ParentClass
{
	static void parent()
	{
		System.out.println("Hey I am parent class method");
	}
}


public class ChildClass extends ParentClass
{
	static void child()
	{
		System.out.println("Hey I am child class method");
	}

	public static void main(String[] args) 
	{
		child();
		parent();

	}

}
