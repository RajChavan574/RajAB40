package Array; //Q. how to sort the value of your arrays.

import java.util.Arrays;

public class Arrays_Problem_2 {

	public static void main(String[] args) 
	{
		int number[]=new int[3];
		
		number[0]=11;
		number[1]=15;
		number[2]=21;
		
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));

	}

}
