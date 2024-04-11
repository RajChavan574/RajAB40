package Array; //Q. create a array of length 5 of int datatype and store the value in it using scanner class. 

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Problem_4 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		int[] age =new int [5];
		
		
		for (int i=0;i<5;i++)
		{
            System.out.println("Enter value " + (i + 1) + ":");
            age[i] = s1.nextInt();
        }
		s1.close();
		
		System.out.println("Values stored in the array:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Value " + (i + 1) + ": " + age[i]);
	    }
     }
}
