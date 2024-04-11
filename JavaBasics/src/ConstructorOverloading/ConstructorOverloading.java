package ConstructorOverloading;

public class ConstructorOverloading // developing multiple constructor but variation in the argument list called as constructor overloading.
{
	ConstructorOverloading (int a)
	{
		this('c'); //this calling statement
		System.out.println("1");
	}
	ConstructorOverloading (char a)
	{
		this("Raj");
		System.out.println("2");
	}
	ConstructorOverloading(String b)
	{
		this(true);
		System.out.println("3");
	}
	ConstructorOverloading(boolean a)
	{
		this(100,false,"Hello");
		System.out.println("4");
	}
	ConstructorOverloading(int a, boolean b, String c)
	{
		System.out.println("5");
	}
	public static void main(String[] args) 
	{
		new ConstructorOverloading(5); //one object for 1 constructor
		
	}

}

