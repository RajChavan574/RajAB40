package Assignments;

public class Assignment_06 

{
	static //SIB
	{
		System.out.println("I am SIB");
	}
	
	{
		System.out.println("I am IIB");
	}
	
	Assignment_06()//constructor
	{
		System.out.println("I am Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("I am your first main method");
		Assignment_06 s1= new Assignment_06();
		
		System.out.println("I am your second main method");
		Assignment_06 s2= new Assignment_06(); // Additional object creation

	}

}
