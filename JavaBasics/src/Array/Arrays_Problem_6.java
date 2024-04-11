package Array;   //Assignment-21 Q2.check if the given string only consist of digit.

import java.util.Arrays;

public class Arrays_Problem_6 
{
	public static void main(String[] args) 
	{
		int count_of_numeric=0;
		boolean output;
		String name="123456";
		char[] a1=name.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		System.out.println(name.length());
		
		for (int i=0;i<name.length();i++)
		{
			output=Character.isDigit(a1[i]);
			System.out.println(output);
			
			if (output==true)
			{
				count_of_numeric++;
			}
		}
		System.out.println("The number of numeric in -->"+ count_of_numeric );
		
		if (name.length()==count_of_numeric)
		{
			System.out.println("Yes the given string consists only Digits");
		}
		else
		{
			System.out.println("No the given string does not consists only Digits");
		}
	}
}
