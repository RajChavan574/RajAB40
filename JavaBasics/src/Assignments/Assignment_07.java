package Assignments;

import java.util.Scanner;

public class Assignment_07 {
	
	int a;
	int b;
	
	void add()
	{
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	
	void sub()
	{
		int subtraction=a-b;
		System.out.println("sub="+subtraction);
	}
	
	void multi()
	{
		int multiplication=a*b;
		System.out.println("multi="+multiplication);
	}
	
	void div()
	{
		int division=a/b;
		System.out.println("div="+division);
	}
	
	void modulus()
	{
		int mod=a%b;
		System.out.println("modulus="+mod);
	}
	

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		int a = s1.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = s1.nextInt();
		
		Assignment_07 a1 = new Assignment_07();
		a1.a = a;
		a1.b = b;
		
		a1.add();
		a1.sub();
		a1.multi();
		a1.div();
		a1.modulus();
		
		s1.close();

	}

}
