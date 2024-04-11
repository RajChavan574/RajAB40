package String; //Q.check if the given string only consist of alphabet.

public class String_Problem_11 
{

	public static void main(String[] args) 
	{
		int count_of_alpha=0;
		boolean answer1;
		String name="RajChavan1";
		char[]a1= name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
		answer1= Character.isAlphabetic(a1[i]);
		System.out.println(answer1);
		
		if(answer1==true)
		{
			count_of_alpha++;
		}
		}
		System.out.println("The Number of alphabat in the given String is--> ="+count_of_alpha);

	}

}
