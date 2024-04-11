package MethodOverRiding;
class Parent_Class
{
	void add()
	{
		System.out.println("Adding 3 numbers");
	}
}
public class MethodOverriding extends Parent_Class
{
	void add()
	{
		//super.add();
		System.out.println("Adding 2 numbers");
		super.add(); //super keyword is only used in method overriding to call the suppressed keyword.
	}
	public static void main(String[] args) 
	{
		MethodOverriding m1= new MethodOverriding();
		m1.add();
		
	}
}
