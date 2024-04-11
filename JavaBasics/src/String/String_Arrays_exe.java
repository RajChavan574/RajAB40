package String; //Q. check the given two arrays are equal to each others.

import java.util.Arrays;

public class String_Arrays_exe 
{

	public static void main(String[] args) 
	{
		int number[]=new int[3];
		int number2[]=new int[3];
		number[0]=11;
		number[1]=15;
		number[2]=21;
		number2[0]=11;
		number2[1]=15;
		number2[2]=21;
		
		boolean answer= Arrays.equals(number, number2);
		System.out.println(answer);

	}

}

