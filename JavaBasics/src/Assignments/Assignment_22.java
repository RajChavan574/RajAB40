package Assignments; //Q. if the no is divisible by 3 print frog , if the no is divisible by 5 print cat, 
				//if the no is divisible by 3 and 5 both then print frog and cat.
				//if(no%3==0) print frog //if(no%5==0) print cat
				//if(no%3==0 && no%5==0) print frog and cat

public class Assignment_22 
{
	public static void main(String[] args) 
	{
		int no[]=new int[5];
		no[0]=7;
		no[1]=5;
		no[2]=15;
		no[3]=6;
		no[4]=19;
		for (int i=0; i < no.length;i++)
		{
			if(no[i]%3==0 && no[i]%5==0)
			{
				System.out.println("The no." + no[i] + " is divisble by both 3 & 5 -> Frog & Cat " + " At the index position " + i);
			}
			else if(no[i]%3==0)
			{
				System.out.println("The no." + no[i] + " is divisble by 3 -> Frog " + " At the index position " + i);
			}
			else if(no[i]%5==0)
			{
				System.out.println("The no." + no[i] + " is divisble by 5 -> Cat " + " At the index position " + i);
			}
			else
			{
				System.out.println("The no." + no[i] + " is not divisible by 3 and 5 ");
			}
		}
	}
}
