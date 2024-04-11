package Assignments; //Assignment_17 - Palindrome input Scanner Class
import java.util.Scanner;

public class Assignment_17 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the word->");
		String input=     s1.next();
		s1.close();
		String output = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			char rev= input.charAt(i);
			output= output+rev;		
		}	
		if (input.equals(output))
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}
}
