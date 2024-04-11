package Assignments; //(1st int a ,2nd float a ,3rd char a ,4th string a ,5th boolean a) 

public class Assignment_05
{
	Assignment_05(int a)
	{
		System.out.println("1");
	}
	Assignment_05 (float a)
	{
		System.out.println("2");
	}
	Assignment_05 (char myLetter)
	{
		System.out.println("3");
	}
	Assignment_05 (String a)
	{
		System.out.println("4");
	}
	Assignment_05 (boolean a)
	{
		System.out.println("5");
	}
	
	public static void main(String[] args) 
	{
		new Assignment_05(11);
		new Assignment_05(8.90f);
		new Assignment_05('A');		
		new Assignment_05("Hello");
		new Assignment_05(true);
	}
}
