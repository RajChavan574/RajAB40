package Assignments;

import java.util.Scanner;

public class Assignment_08 {
	
	static int a;
	static int b;
	
	static void add()
	{
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	
	static void sub()
	{
		int subtraction=a-b;
		System.out.println("sub="+subtraction);
	}
	
	static void multi()
	{
		int multiplication=a*b;
		System.out.println("multi="+multiplication);
	}
	
	static void div()
	{
		int division=a/b;
		System.out.println("div="+division);
	}
	
	static void modulus()
	{
		int mod=a%b;
		System.out.println("modulus="+mod);
	}
	

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		a = s1.nextInt();
		
		System.out.println("Enter the value of b: ");
		b = s1.nextInt();
		
		
		add();
		sub();
		multi();
		div();
		modulus();
		
		s1.close();

	}

}
