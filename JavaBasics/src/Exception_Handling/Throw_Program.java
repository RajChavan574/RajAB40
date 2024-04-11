package Exception_Handling;

public class Throw_Program 
{

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		//throw new NullPointerException();
		
		Thread.sleep(2000);
		
		throw new NullPointerException("sorry your file is empty");
		
		

	}

}
