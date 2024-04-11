package JavaProgram;

public class ConstructorOverloading // developing multiple constructor but variation in the argument list called as constructor overloading.
{
	ConstructorOverloading (int a, int b)
	{
		System.out.println("1");
	}
	ConstructorOverloading (double a)
	{
		System.out.println("2");
	}
	ConstructorOverloading()
	{
		System.out.println("3");
	}
	
	public static void main(String[] args) 
	{
		new ConstructorOverloading(); //one object for 1 constructor
		new ConstructorOverloading(65.65);
		new ConstructorOverloading(10,30);	
	}

}

