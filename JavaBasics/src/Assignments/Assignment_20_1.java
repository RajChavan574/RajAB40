package Assignments; //"Q1)check in the given string how many Special characters are present
					
import java.util.Arrays;

public class Assignment_20_1 
{
	public static void main(String[] args) 
	{
		int no_of_special_chars =0;
		int no_of_alpha=0;
		int no_of_digit=0;
		int no_of_Space=0;
		int length_of_string=0;
		
		String name="Raj123 @#$ Chavan";

		
		for(int i=0;i<name.length();i++)
		{
			char a1 = name.charAt(i);
			
			if (Character.isDigit(a1)) 
			{
                no_of_digit++;
            } 
			else if (Character.isAlphabetic(a1)) 
            {
                no_of_alpha++;
            } 
			else if (Character.isSpaceChar(a1)) 
            {
                no_of_Space++;
            } 
			else 
			{
                no_of_special_chars++;
            }
			length_of_string++;
		}

		System.out.println("The Number of special character in the given String is--> ="+no_of_special_chars);
		System.out.println("The Number of Digit in the given String is--> ="+no_of_digit);
		System.out.println("The Number of alpha in the given String is--> ="+no_of_alpha);
		System.out.println("The Number of space in the given String is--> ="+no_of_Space);
		System.out.println("The length of string in the given String is--> ="+length_of_string);
	}
}


