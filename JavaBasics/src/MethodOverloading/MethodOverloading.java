package MethodOverloading; //developing multiple methods in same name but variation in the argument is list.
					// we can overload static as well as non static method.

public class MethodOverloading 
{
	void add()
	{
		System.out.println("Addition");
	}
	void add(int a)
	{
		System.out.println(a+6);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, int b)
	{
		System.out.println(a+b);
	}
	static void add(String a, int b, double c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		add("Raj",100,6.01);
		MethodOverloading m1=new MethodOverloading();
		m1.add(10,0.86);
		m1.add(0.9,11);
		m1.add();
		m1.add(100);
	}

}

