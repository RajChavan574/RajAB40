package String; //Q. check in the given string how many are the space.

public class String_Problem_10 
{

	public static void main(String[] args) 
	{
		int count_of_space=0;
		boolean answer1;
		String name="Raj Chavan  1";
		char[]a1= name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
		answer1= Character.isSpace(a1[i]);
		System.out.println(answer1);
		
		if(answer1==true)
		{
			count_of_space++;
		}
		}
		System.out.println("The Number of space in the given String is--> ="+count_of_space);

	}
}


