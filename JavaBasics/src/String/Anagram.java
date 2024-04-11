package String; //Q.check the two string are anagram of each other.

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args) 
	{
		String a1= "horse";
		String a2= "shore";
		
		char []c1= a1.toCharArray();
		char []c2= a2.toCharArray();
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean a3 = Arrays.equals(c1,c2);
		if(a3==true)
		{
			System.out.println("They are anagram of each other");
		}
		else
		{
			System.out.println("They are not anagram of each other"); 
		}
	}
}


//Q.check if the given string only consist of alphabet.
//Q.check if the given string only consist of digit.
//Q. find out the average value present in the given string.
