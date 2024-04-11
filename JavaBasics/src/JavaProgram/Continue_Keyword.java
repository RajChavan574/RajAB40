package JavaProgram;

public class Continue_Keyword 
{
	public static void main(String[] args)
	{
		for(int i=0; i<6; i++)
		{
			if (i==4)
			{
				continue;   //Continue keyword in java used to skip the Iteration. 
			}
			System.out.println("My Age is "+ i);
		}
	}
}
