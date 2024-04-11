package String; //Q. write a java program to copy the array by treating the array. 

import java.util.Arrays;

public class Array_Exercise2 {

	public static void main(String[] args) 
	{
		int num[]=new int[5];
		int number[]=new int[5];
		number[0]=74;
		number[1]=52;
		number[2]=63;
		number[3]=52;
		number[4]=20;
		for (int i =0; i < number.length;i++)
		{
			num[i]=number[i];
		}
		System.out.println("The first array is-> " + Arrays.toString(number));
		System.out.println("The copied Array is-> " + Arrays.toString(num));

	}

}
//Q.create a array and print them into reverse order.
