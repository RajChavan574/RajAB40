package Array; //Assignment-21 Q1.check if the given string only consist of alphabet.

import java.util.Arrays;

public class Arrays_Problem_5 
{
	public static void main(String[] args) 
	{
		int count_of_alpha=0;
		boolean output;
		String name="Raj123";
		char[] a1=name.toCharArray();
		
		for (int i=0;i<name.length();i++)
		{
			output=Character.isAlphabetic(a1[i]);
			System.out.println(output);
			
			if (output==true)
			{
				count_of_alpha++;
			}
		}
		System.out.println("The number of alpha in -->"+ count_of_alpha );
	}
}
