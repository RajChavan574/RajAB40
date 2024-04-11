package String; //Q.create a array and print them into reverse order.

import java.util.Arrays;

public class Array_Exercise3 {

	public static void main(String[] args) 
	{
		int num[]=new int[5];
		int number[]=new int[5];
		int k=num.length -1;
		number[0]=74;
		number[1]=52;
		number[2]=63;
		number[3]=52;
		number[4]=20;
		for (int i =0; i < number.length;i++)
		{
			num[k]=number[i];
			k--;
		}
		System.out.println("The first array is-> " + Arrays.toString(number));
		System.out.println("The reverse Array is-> " + Arrays.toString(num));

	}

}


