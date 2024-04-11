package String; //Q. in a given string calculate the number of numeric value.

import java.util.Arrays;

public class CountOfNumber 
{

	public static void main(String[] args) 
	{
		int count_of_numeric=0;
		boolean answer1;
		String name="RajChavan1";
		char[]a1= name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
		answer1= Character.isDigit(a1[0]);
		System.out.println(answer1);
		
		if(answer1==true)
		{
			count_of_numeric++;
		}
		}
		System.out.println("The Number of Numberic in the given String is--> ="+count_of_numeric);


	}

}
