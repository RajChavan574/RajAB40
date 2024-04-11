package Array;

import java.util.Arrays;

public class Arrays_1 {

	public static void main(String[] args) 
	{
		int age[]=new int [5];
		age[0]=19;
		age[1]=90;
		age[2]=5;
		age[3]=77;
		age[4]=51;
		for (int i=0;i<5;i++)
		{
			System.out.println(age[i]);
		}
		//one more way to print values
		System.out.println("one more way to print values");
		System.out.println(Arrays.toString(age));
	}

}
