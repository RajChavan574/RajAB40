package String;  //Q. in a given string check which is the numeric value.

import java.util.Arrays;

public class String_Arrays4 
{

	public static void main(String[] args) 
	{
		boolean answer1;
		String name="RajChavan1";
		char[]a1= name.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<name.length();i++)
		{
		answer1= Character.isDigit(a1[0]);
		System.out.println(answer1);
		
		if(answer1==true)
		{
			System.out.println("Numeric is present at index="+i);
		}
		}

	}

}
