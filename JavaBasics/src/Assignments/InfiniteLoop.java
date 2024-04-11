package Assignments;

public class InfiniteLoop 
{

	public static void main(String[] args) 
	{
		// Using increment operator in an infinite loop
        for (int i = 0; ; i++) 
        { // No condition provided for termination
            System.out.println("Iteration: " + i);
            // i++; // Increment operator can also be used here
        }
	}

}
