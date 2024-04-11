package JavaProgram;

public class nested_if_else 
{

	public static void main(String[] args) 
	{
		int age=20;
		String gender ="Female";
		boolean isRegistered = false;
		if(age>18)
			{
				System.out.println("Your eligible");
			}
			else if (age<18)
			{
				System.out.println("Your not eligible");
			}
			if(gender=="Male")
			{
				System.out.println("You are invited");
			}
			if (isRegistered==true)
			{
				System.out.println("You have account");
			}
			else if (isRegistered==false)
			{
				System.out.println("You don't have account");
			}
			
	}

}
