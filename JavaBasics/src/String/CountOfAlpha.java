package String; //Q. check in the given string how many are the alphabat.

public class CountOfAlpha {

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
